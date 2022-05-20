package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.DessertID;
import co.com.sofka.challengeDDD.domain.food.values.Name;
import co.com.sofka.challengeDDD.domain.food.values.Price;
import co.com.sofka.challengeDDD.domain.food.values.Taste;
import co.com.sofka.domain.generic.DomainEvent;

public class DessertAdded extends DomainEvent {
    private final DessertID dessertID;
    private final Name name;
    private final Price price;
    private final Taste taste;

    public DessertAdded(DessertID dessertID, Name name, Price price, Taste taste) {
        super("com.food.DessertAdded");
        this.dessertID = dessertID;
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public Taste getTaste() {
        return taste;
    }

    public DessertID getDessertID() {
        return dessertID;
    }

    public Name getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }
}
