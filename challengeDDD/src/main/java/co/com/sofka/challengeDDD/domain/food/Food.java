package co.com.sofka.challengeDDD.domain.food;

import co.com.sofka.challengeDDD.domain.food.events.FoodCreated;
import co.com.sofka.challengeDDD.domain.food.values.Payment;
import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Food extends AggregateEvent<FoodID> {
    protected Payment payment;
    protected Set<Drink> drinks;
    protected Set<Dessert> desserts;
    protected Set<Appetizer> appetizers;

    public Food(FoodID entityId, Payment payment) {
        super(entityId);
        appendChange(new FoodCreated(payment)).apply();
    }

    public Food(FoodID entityId) {
        super(entityId);
        subscribe(new FoodChange(this));
    }

    public static Food from(FoodID foodID, List<DomainEvent> events){
        var food = new Food(foodID);
        events.forEach(food::applyEvent);
        return food;
    }

    public Payment payment() {
        return payment;
    }

    public Set<Drink> drinks() {
        return drinks;
    }

    public Set<Dessert> desserts() {
        return desserts;
    }

    public Set<Appetizer> appetizers() {
        return appetizers;
    }

}
