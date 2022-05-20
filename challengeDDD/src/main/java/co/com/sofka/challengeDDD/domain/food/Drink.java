package co.com.sofka.challengeDDD.domain.food;

import co.com.sofka.challengeDDD.domain.food.values.DessertID;
import co.com.sofka.challengeDDD.domain.food.values.Name;
import co.com.sofka.challengeDDD.domain.food.values.Price;
import co.com.sofka.challengeDDD.domain.food.values.Size;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Drink extends Entity<DessertID> {
    private Name name;
    private Price price;
    private Size size;

    public Drink(DessertID entityId, Name name, Price price, Size size) {
        super(entityId);
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public void updateName(Name name) {
        this.name= Objects.requireNonNull(name);
    }

    public void updatePrice(Price price) {
        this.price= Objects.requireNonNull(price);
    }

    public void updateSize(Size size) {
        this.size= Objects.requireNonNull(size);
    }

    public Name name() {
        return name;
    }

    public Price price() {
        return price;
    }

    public Size size() {
        return size;
    }
}
