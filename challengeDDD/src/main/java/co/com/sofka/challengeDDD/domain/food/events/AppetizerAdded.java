package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.AppetizerID;
import co.com.sofka.challengeDDD.domain.food.values.Name;
import co.com.sofka.challengeDDD.domain.food.values.Price;
import co.com.sofka.challengeDDD.domain.food.values.Texture;
import co.com.sofka.challengeDDD.domain.sale.values.Classification;
import co.com.sofka.domain.generic.DomainEvent;

public class AppetizerAdded extends DomainEvent {
    private final AppetizerID appetizerID;
    private final Name name;
    private final Price price;
    private final Texture texture;

    public AppetizerAdded(AppetizerID appetizerID, Name name, Price price, Texture texture) {
        super("com.food.AppetizerAdded");
        this.appetizerID = appetizerID;
        this.name = name;
        this.price = price;
        this.texture = texture;
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
