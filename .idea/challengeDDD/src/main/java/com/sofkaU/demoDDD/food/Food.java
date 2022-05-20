package com.sofkaU.demoDDD.food;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.events.*;
import com.sofkaU.demoDDD.food.values.*;

import java.util.List;
import java.util.Set;

public class Food extends AggregateEvent<FoodID> {

    protected RestaurantBranchName restaurantBranchName;
    protected Price price;
    protected MenuName menuName;
    protected Set<Dish> dishes;
    protected Set<Drink> drinks;
    protected Set<Entry> entries;

    public Food(FoodID entityId, RestaurantBranchName restaurantBranchName, Price price, MenuName menuName){
        super(entityId);
        appendChange(new FoodCreated(restaurantBranchName,price,menuName)).apply();
    }

    private Food(FoodID foodID){
        super(foodID);
        subscribe(new FoodChange(this));
    }

    public static Food from(FoodID foodID, List<DomainEvent> events){
        Food food= new Food(foodID);
        events.forEach((event)->food.applyEvent(event));
        return food;
    }

    public void addDish(Name name){
        var dishID=new DishID();
        appendChange(new DishAdded(dishID, name)).apply();
    }

    public void addDrink(Name name, Size size){
        var drinkID=new DrinkID();
        appendChange(new DrinkAdded(drinkID,name,size)).apply();
    }

    public void addEntry(Name name, Type type){
        var entryID=new EntryID();
        appendChange(new EntryAdded(entryID,name,type)).apply();
    }

    public void dishNameUpdate(DishID dishID, Name name){
        appendChange(new DishNameUpdated(dishID,name)).apply();
    }

    public RestaurantBranchName restaurantBranchName() {
        return restaurantBranchName;
    }

    public Price price() {
        return price;
    }

    public MenuName menuName() {
        return menuName;
    }

    public Set<Dish> dishes() {
        return dishes;
    }

    public Set<Drink> drinks() {
        return drinks;
    }

    public Set<Entry> entries() {
        return entries;
    }
}
