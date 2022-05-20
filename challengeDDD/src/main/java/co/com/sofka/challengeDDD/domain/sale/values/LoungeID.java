package co.com.sofka.challengeDDD.domain.sale.values;

import co.com.sofka.domain.generic.Identity;

public class LoungeID extends Identity {
    public LoungeID() {
    }

    private LoungeID(String uuid) {
        super(uuid);
    }

    public static LoungeID of(String id){
        return new LoungeID(id);
    }
}
