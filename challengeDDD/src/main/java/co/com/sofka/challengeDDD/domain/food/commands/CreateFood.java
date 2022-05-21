package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.challengeDDD.domain.food.values.Payment;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class CreateFood extends Command {
    private final FoodID foodID;
    private final Payment payment;

    public CreateFood(FoodID foodID, Payment payment) {
        this.foodID = foodID;
        this.payment = payment;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public Payment getPayment() {
        return payment;
    }
}
