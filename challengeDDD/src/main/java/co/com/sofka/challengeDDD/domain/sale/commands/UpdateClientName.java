package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.ClientID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class UpdateClientName extends Command {
    private final SaleID saleID;
    private final ClientID clientID;
    private final Name name;

    public UpdateClientName(SaleID saleID, ClientID clientID, Name name) {
        this.saleID = saleID;
        this.clientID = clientID;
        this.name = name;
    }

    public SaleID getSaleID() {
        return saleID;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public Name getName() {
        return name;
    }

}
