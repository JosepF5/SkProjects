package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class AppetizerPriceUpdated extends DomainEvent {
    private final AppetizerID appetizerID;
    private final Price price;

    public AppetizerPriceUpdated(AppetizerID appetizerID ,Price price) {
        super("com.food.AppetizerPriceUpdated");
        this.appetizerID = appetizerID;
        this.price = price;
    }

    public AppetizerID getAppetizerID() {
        return appetizerID;
    }

    public Price getPrice() {
        return price;
    }

}
