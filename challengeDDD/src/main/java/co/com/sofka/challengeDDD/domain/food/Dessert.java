package co.com.sofka.challengeDDD.domain.food;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Dessert extends Entity<DessertID> {
    private Name name;
    private Price price;
    private Taste taste;

    public Dessert(DessertID entityId, Name name, Price price, Taste taste) {
        super(entityId);
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public void updateName(Name name) {
        this.name= Objects.requireNonNull(name);
    }

    public void updatePrice(Price price) {
        this.price= Objects.requireNonNull(price);
    }

    public void updateTaste(Taste taste) {
        this.taste= Objects.requireNonNull(taste);
    }

    public Name name() {
        return name;
    }

    public Price price() {
        return price;
    }

    public Taste taste() {
        return taste;
    }
}
