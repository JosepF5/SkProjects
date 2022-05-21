package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.ClientID;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.challengeDDD.domain.sale.values.Status;
import co.com.sofka.domain.generic.Command;

public class ChangeClientStatus extends Command {
    private final SaleID saleID;
    private final ClientID clientID;
    private final Status status;

    public ChangeClientStatus(SaleID saleID, ClientID clientID, Status status) {
        this.saleID = saleID;
        this.clientID = clientID;
        this.status = status;
    }

    public SaleID getSaleID() {
        return saleID;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public Status getStatus() {
        return status;
    }
}
