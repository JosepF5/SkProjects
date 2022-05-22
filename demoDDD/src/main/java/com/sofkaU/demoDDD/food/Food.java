package com.sofkaU.demoDDD.food;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.*;
import com.sofkaU.demoDDD.food.events.*;

import java.util.List;
import java.util.Objects;
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

    public void addDish(DishID dishID,Name name){
        Objects.requireNonNull(dishID);
        Objects.requireNonNull(name);
        appendChange(new DishAdded(dishID, name)).apply();
    }

    public void addEntry(EntryID entryID, Name name, Type type){
        Objects.requireNonNull(entryID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(type);
        appendChange(new EntryAdded(entryID,name,type)).apply();
    }

    public void addDrink(DrinkID drinkID, Name name, Size size){
        Objects.requireNonNull(drinkID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(size);
        appendChange(new DrinkAdded(drinkID,name,size)).apply();
    }

    public void updateDishName(DishID dishID, Name name){
        Objects.requireNonNull(dishID);
        Objects.requireNonNull(name);
        appendChange(new DishNameUpdated(dishID,name)).apply();
    }

    public void updateDrinkName(DrinkID drinkID, Name name){
        Objects.requireNonNull(drinkID);
        Objects.requireNonNull(name);
        appendChange(new DrinkNameUpdated(drinkID,name)).apply();
    }

    public void updateDrinkSize(DrinkID drinkID,Size size){
        Objects.requireNonNull(drinkID);
        Objects.requireNonNull(size);
        appendChange(new DrinkSizeUpdated(drinkID,size)).apply();
    }

    public void changeEntryType(EntryID entryID, Type type){
        Objects.requireNonNull(entryID);
        Objects.requireNonNull(type);
        appendChange(new EntryTypeChanged(entryID,type)).apply();
    }

    public void updateHolidayName(EntryID entryID, Name name){
        Objects.requireNonNull(entryID);
        Objects.requireNonNull(name);
        appendChange(new EntryNameUpdated(entryID,name)).apply();
    }

    public void changeMenuName(MenuName menuName){
        Objects.requireNonNull(menuName);
        appendChange(new MenuNameChanged(menuName)).apply();
    }

    public void changePrice(Price price){
        Objects.requireNonNull(price);
        appendChange(new PriceChanged(price)).apply();
    }

    public void updateRestaurantBranchName(RestaurantBranchName restaurantBranchName){
        Objects.requireNonNull(restaurantBranchName);
        appendChange(new RestaurantBranchNameUpdated(restaurantBranchName)).apply();
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
