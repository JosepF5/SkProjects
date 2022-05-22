package co.com.sofka.challengeDDD.domain.sale;

import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Lounge extends Entity<LoungeID> {
    private AmountOfSeats amountOfSeats;
    private Effects effects;

    public Lounge(LoungeID entityId,Effects effects,AmountOfSeats amountOfSeats) {
        super(entityId);
        this.effects = effects;
        this.amountOfSeats = amountOfSeats;
    }

    public void updateEffects(Effects effects) {
        this.effects= Objects.requireNonNull(effects);
    }

    public void updateAmountOfSeats(AmountOfSeats amountOfSeats) {
        this.amountOfSeats= Objects.requireNonNull(amountOfSeats);
    }

    public Effects effects() {
        return effects;
    }

    public AmountOfSeats amountOfSeats() {
        return amountOfSeats;
    }
}
