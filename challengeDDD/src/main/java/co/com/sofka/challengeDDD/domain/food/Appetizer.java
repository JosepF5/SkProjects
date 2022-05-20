package co.com.sofka.challengeDDD.domain.food;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Appetizer extends Entity<AppetizerID> {
    private Name name;
    private Price price;
    private Texture texture;

    public Appetizer(AppetizerID entityId, Name name, Price price, Texture texture) {
        super(entityId);
        this.name = name;
        this.price = price;
        this.texture = texture;
    }

    public void updateName(Name name) {
        this.name= Objects.requireNonNull(name);
    }

    public void updatePrice(Price price) {
        this.price= Objects.requireNonNull(price);
    }

    public void updateTexture(Texture texture) {
        this.texture= Objects.requireNonNull(texture);
    }

    public Name name() {
        return name;
    }

    public Price price() {
        return price;
    }

    public Texture texture() {
        return texture;
    }
}
