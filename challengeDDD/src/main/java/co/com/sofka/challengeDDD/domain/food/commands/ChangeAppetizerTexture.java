package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.AppetizerID;
import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.challengeDDD.domain.food.values.Texture;
import co.com.sofka.domain.generic.Command;

public class ChangeAppetizerTexture extends Command {
    private final FoodID foodID;
    private final AppetizerID appetizerID;
    private final Texture texture;

    public ChangeAppetizerTexture(FoodID foodID, AppetizerID appetizerID, Texture texture) {
        this.foodID = foodID;
        this.appetizerID = appetizerID;
        this.texture = texture;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public AppetizerID getAppetizerID() {
        return appetizerID;
    }

    public Texture getTexture() {
        return texture;
    }
}
