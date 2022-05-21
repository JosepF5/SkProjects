package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.Effects;
import co.com.sofka.challengeDDD.domain.sale.values.LoungeID;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class UpdateLoungeEffects extends Command {
    private final SaleID saleID;
    private final LoungeID loungeID;
    private final Effects effects;

    public UpdateLoungeEffects(SaleID saleID, LoungeID loungeID, Effects effects) {
        this.saleID = saleID;
        this.loungeID = loungeID;
        this.effects = effects;
    }

    public SaleID getSaleID() {
        return saleID;
    }

    public LoungeID getLoungeID() {
        return loungeID;
    }

    public Effects getEffects() {
        return effects;
    }
}
