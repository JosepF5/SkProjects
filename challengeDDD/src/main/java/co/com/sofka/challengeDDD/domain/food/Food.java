package co.com.sofka.challengeDDD.domain.food;

import co.com.sofka.challengeDDD.domain.food.events.*;
import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.challengeDDD.domain.sale.Employee;
import co.com.sofka.challengeDDD.domain.sale.Lounge;
import co.com.sofka.challengeDDD.domain.sale.Movie;
import co.com.sofka.challengeDDD.domain.sale.values.EmployeeID;
import co.com.sofka.challengeDDD.domain.sale.values.LoungeID;
import co.com.sofka.challengeDDD.domain.sale.values.MovieID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
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

    public void updatePayment(Payment payment){
        Objects.requireNonNull(payment);
        appendChange(new PaymentUpdated(payment)).apply();
    }

    public void addAppetizer(AppetizerID appetizerID, Name name, Price price, Texture texture){
        Objects.requireNonNull(appetizerID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(price);
        Objects.requireNonNull(texture);
        appendChange(new AppetizerAdded( appetizerID,  name,  price,  texture)).apply();
    }

    public void addDessert(DessertID dessertID, Name name, Price price, Taste taste){
        Objects.requireNonNull(dessertID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(price);
        Objects.requireNonNull(taste);
        appendChange(new DessertAdded( dessertID,  name,  price,  taste)).apply();
    }

    public void addDrink(DrinkID drinkID, Name name, Price price, Size size){
        Objects.requireNonNull(drinkID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(price);
        Objects.requireNonNull(size);
        appendChange(new DrinkAdded( drinkID,  name,  price,  size)).apply();
    }

    public void changeAppetizerTexture(AppetizerID appetizerID, Texture texture){
        Objects.requireNonNull(appetizerID);
        Objects.requireNonNull(texture);
        appendChange(new AppertizerTextureChanged( appetizerID,  texture)).apply();
    }

    public void changeDrinkSize(DrinkID drinkID, Size size){
        Objects.requireNonNull(drinkID);
        Objects.requireNonNull(size);
        appendChange(new DrinkSizeChanged( drinkID,  size)).apply();
    }

    public void updateAppetizerName(AppetizerID appetizerID, Name name){
        Objects.requireNonNull(appetizerID);
        Objects.requireNonNull(name);
        appendChange(new AppetizerNameUpdated( appetizerID,  name)).apply();
    }

    public void updateAppetizerPrice(AppetizerID appetizerID ,Price price){
        Objects.requireNonNull(appetizerID);
        Objects.requireNonNull(price);
        appendChange(new AppetizerPriceUpdated( appetizerID , price)).apply();
    }

    public void updateDessertName(DessertID dessertID, Name name){
        Objects.requireNonNull(dessertID);
        Objects.requireNonNull(name);
        appendChange(new DessertNameUpdated( dessertID,  name)).apply();
    }

    public void updateDessertPrice(DessertID dessertID, Price price){
        Objects.requireNonNull(dessertID);
        Objects.requireNonNull(price);
        appendChange(new DessertPriceUpdated( dessertID,  price)).apply();
    }

    public void updateDessertTaste(DessertID dessertID, Taste taste){
        Objects.requireNonNull(dessertID);
        Objects.requireNonNull(taste);
        appendChange(new DessertTasteUpdated( dessertID,  taste)).apply();
    }

    public void updateDrinkName(DrinkID drinkID, Name name){
        Objects.requireNonNull(drinkID);
        Objects.requireNonNull(name);
        appendChange(new DrinkNameUpdated( drinkID,  name)).apply();
    }

    public void updateDrinkPrice(DrinkID drinkID,Price price){
        Objects.requireNonNull(drinkID);
        Objects.requireNonNull(price);
        appendChange(new DrinkPriceUpdated( drinkID, price)).apply();
    }

    public Optional<Appetizer> getAppetizerById(AppetizerID entityId) {
        return appetizers()
                .stream()
                .filter(appetizer -> appetizer.identity().equals(entityId))
                .findFirst();
    }
    public Optional<Dessert> getDessertById(DessertID entityId) {
        return desserts()
                .stream()
                .filter(dessert -> dessert.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Drink> getDrinkById(DrinkID entityId) {
        return drinks()
                .stream()
                .filter(drink -> drink.identity().equals(entityId))
                .findFirst();
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
