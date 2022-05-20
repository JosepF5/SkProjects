package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class LoungeAdded extends DomainEvent {
    private final LoungeID loungeID;
    private final AmountOfSeats amountOfSeats;
    private final Effects effects;

    public LoungeAdded(LoungeID loungeID, AmountOfSeats amountOfSeats, Effects effects) {
        super("com.sale.loungeadded");
        this.loungeID = loungeID;
        this.amountOfSeats = amountOfSeats;
        this.effects = effects;
    }

    public LoungeID getLoungeID() {
        return loungeID;
    }

    public AmountOfSeats getAmountOfSeats() {
        return amountOfSeats;
    }

    public Effects getEffects() {
        return effects;
    }
}
