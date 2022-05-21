package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.Effects;
import co.com.sofka.challengeDDD.domain.sale.values.LoungeID;
import co.com.sofka.domain.generic.DomainEvent;

public class LoungeEffectsUpdated extends DomainEvent {
    private final LoungeID loungeID;
    private final Effects effects;

    public LoungeEffectsUpdated(LoungeID loungeID, Effects effects) {
        super("com.sale.loungeeffectsupdated");
        this.loungeID = loungeID;
        this.effects = effects;
    }

    public LoungeID getLoungeID() {
        return loungeID;
    }

    public Effects getEffects() {
        return effects;
    }
}
