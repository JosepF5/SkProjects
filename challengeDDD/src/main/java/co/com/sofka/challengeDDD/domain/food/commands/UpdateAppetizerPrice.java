package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdateAppetizerPrice extends Command {
    private final FoodID foodID;
    private final AppetizerID appetizerID;
    private final Price price;

    public UpdateAppetizerPrice(FoodID foodID, AppetizerID appetizerID, Price price) {
        this.foodID = foodID;
        this.appetizerID = appetizerID;
        this.price = price;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public AppetizerID getAppetizerID() {
        return appetizerID;
    }

    public Price getPrice() {
        return price;
    }

}
