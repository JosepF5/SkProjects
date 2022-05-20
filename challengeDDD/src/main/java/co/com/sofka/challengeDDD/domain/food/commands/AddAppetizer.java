package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.Command;

public class AddAppetizer extends Command {
    private final FoodID foodID;
    private final AppetizerID appetizerID;
    private final Name name;
    private final Price price;
    private final Texture texture;

    public AddAppetizer(FoodID foodID, AppetizerID appetizerID, Name name, Price price, Texture texture) {
        this.foodID = foodID;
        this.appetizerID = appetizerID;
        this.name = name;
        this.price = price;
        this.texture = texture;
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

    public Price getPrice() {
        return price;
    }

    public Texture getTexture() {
        return texture;
    }
}
