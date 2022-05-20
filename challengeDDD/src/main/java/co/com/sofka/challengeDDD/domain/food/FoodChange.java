package co.com.sofka.challengeDDD.domain.food;

import co.com.sofka.challengeDDD.domain.food.events.FoodCreated;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class FoodChange extends EventChange {
    public FoodChange(Food sale) {
        apply((FoodCreated event)->{
            sale.payment= event.getPayment();
            sale.appetizers=new HashSet<>();
            sale.desserts=new HashSet<>();
            sale.drinks=new HashSet<>();
        });
    }
}
