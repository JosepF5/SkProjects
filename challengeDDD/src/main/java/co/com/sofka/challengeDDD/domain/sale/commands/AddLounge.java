package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.AmountOfSeats;
import co.com.sofka.challengeDDD.domain.sale.values.Effects;
import co.com.sofka.challengeDDD.domain.sale.values.LoungeID;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class AddLounge extends Command {
    private final SaleID saleID;
    private final LoungeID loungeID;
    private final AmountOfSeats amountOfSeats;
    private final Effects effects;


    public AddLounge(SaleID saleID, LoungeID loungeID, AmountOfSeats amountOfSeats, Effects effects) {
        this.saleID = saleID;
        this.loungeID = loungeID;
        this.amountOfSeats = amountOfSeats;
        this.effects = effects;
    }

    public SaleID getSaleID() {
        return saleID;
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
