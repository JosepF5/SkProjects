package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class CreateSale extends Command {
    private final SaleID saleID;
    private final Payment payment;

    public CreateSale(SaleID saleID, Payment payment) {
        this.saleID = saleID;
        this.payment = payment;
    }

    public SaleID getSaleID() {
        return saleID;
    }

    public Payment getPayment() {
        return payment;
    }
}
