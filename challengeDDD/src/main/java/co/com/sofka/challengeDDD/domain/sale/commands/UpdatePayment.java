package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class UpdatePayment extends Command {
    private final SaleID saleID;
    private final Payment payment;

    public UpdatePayment(SaleID saleID, Payment payment) {
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
