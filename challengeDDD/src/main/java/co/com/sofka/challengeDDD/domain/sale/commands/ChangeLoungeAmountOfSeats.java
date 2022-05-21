package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.AmountOfSeats;
import co.com.sofka.challengeDDD.domain.sale.values.LoungeID;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class ChangeLoungeAmountOfSeats extends Command {
    private final SaleID saleID;
    private final LoungeID loungeID;
    private final AmountOfSeats amountOfSeats;

    public ChangeLoungeAmountOfSeats(SaleID saleID, LoungeID loungeID, AmountOfSeats amountOfSeats) {
        this.saleID = saleID;
        this.loungeID = loungeID;
        this.amountOfSeats = amountOfSeats;
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

}
