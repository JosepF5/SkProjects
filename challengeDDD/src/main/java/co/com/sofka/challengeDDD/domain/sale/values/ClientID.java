package co.com.sofka.challengeDDD.domain.sale.values;

import co.com.sofka.domain.generic.Identity;

public class ClientID extends Identity {
    public ClientID() {
    }

    private ClientID(String uuid) {
        super(uuid);
    }

    public static ClientID of(String id){
        return new ClientID(id);
    }
}
