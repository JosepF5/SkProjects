package co.com.sofka.challengeDDD.domain.food;

import co.com.sofka.challengeDDD.domain.food.events.*;
import co.com.sofka.challengeDDD.domain.food.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class FoodChange extends EventChange {
    public FoodChange(Food food) {
        apply((FoodCreated event)->{
            food.payment= event.getPayment();
            food.appetizers=new HashSet<>();
            food.desserts=new HashSet<>();
            food.drinks=new HashSet<>();
        });

        apply((AppetizerAdded event) -> {
            var amountOfAppetizers = food.appetizers.size();
            if (amountOfAppetizers > 5) {
                throw new IllegalArgumentException("Can't create more appetizers");
            }
            food.appetizers.add(new Appetizer(
                    event.getAppetizerID(),
                    event.getName(),
                    event.getPrice(),
                    event.getTexture()
            ));
        });

        apply((DessertAdded event) -> {
            var amountOfDesserts = food.desserts.size();
            if (amountOfDesserts > 10) {
                throw new IllegalArgumentException("Can't create more desserts");
            }
            food.desserts.add(new Dessert(
                    event.getDessertID(),
                    event.getName(),
                    event.getPrice(),
                    event.getTaste()
            ));
        });

        apply((DrinkAdded event) -> {
            var amountOfDrinks = food.drinks.size();
            if (amountOfDrinks > 10) {
                throw new IllegalArgumentException("Can't create more drinks");
            }
            food.drinks.add(new Drink(
                    event.getDrinkID(),
                    event.getName(),
                    event.getPrice(),
                    event.getSize()
            ));
        });

        apply((PaymentUpdated event) -> food.payment = event.getPayment());

        apply((AppertizerTextureChanged event) -> {
            var function = food.getAppetizerById(event.getAppetizerID())
                    .orElseThrow(() -> new IllegalArgumentException("Appetizer not found"));
            function.updateTexture(event.getTexture());
        });

        apply((AppetizerNameUpdated event) -> {
            var function = food.getAppetizerById(event.getAppetizerID())
                    .orElseThrow(() -> new IllegalArgumentException("Appetizer not found"));
            function.updateName(event.getName());
        });

        apply((AppetizerPriceUpdated event) -> {
            var function = food.getAppetizerById(event.getAppetizerID())
                    .orElseThrow(() -> new IllegalArgumentException("Appetizer not found"));
            function.updatePrice(event.getPrice());
        });

        apply((DessertTasteUpdated event) -> {
            var function = food.getDessertById(event.getDessertID())
                    .orElseThrow(() -> new IllegalArgumentException("Dessert not found"));
            function.updateTaste(event.getTaste());
        });

        apply((DessertNameUpdated event) -> {
            var function = food.getDessertById(event.getDessertID())
                    .orElseThrow(() -> new IllegalArgumentException("Dessert not found"));
            function.updateName(event.getName());
        });

        apply((DessertPriceUpdated event) -> {
            var function = food.getDessertById(event.getDessertID())
                    .orElseThrow(() -> new IllegalArgumentException("Dessert not found"));
            function.updatePrice(event.getPrice());
        });

        apply((DrinkSizeChanged event) -> {
            var function = food.getDrinkById(event.getDrinkID())
                    .orElseThrow(() -> new IllegalArgumentException("Drink not found"));
            function.updateSize(event.getSize());
        });

        apply((DrinkNameUpdated event) -> {
            var function = food.getDrinkById(event.getDrinkID())
                    .orElseThrow(() -> new IllegalArgumentException("Drink not found"));
            function.updateName(event.getName());
        });

        apply((DrinkPriceUpdated event) -> {
            var function = food.getDrinkById(event.getDrinkID())
                    .orElseThrow(() -> new IllegalArgumentException("Drink not found"));
            function.updatePrice(event.getPrice());
        });
    }
}
