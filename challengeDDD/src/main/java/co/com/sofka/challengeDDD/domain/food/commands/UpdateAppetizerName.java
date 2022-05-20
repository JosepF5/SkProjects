package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdateAppetizerName extends Command {
    private final FoodID foodID;
    private final AppetizerID appetizerID;
    private final Name name;

    public UpdateAppetizerName(FoodID foodID, AppetizerID appetizerID, Name name) {
        this.foodID = foodID;
        this.appetizerID = appetizerID;
        this.name = name;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public AppetizerID getAppetizerID() {
        return appetizerID;
    }

    public Name getName() {
        return name;
    }
}
