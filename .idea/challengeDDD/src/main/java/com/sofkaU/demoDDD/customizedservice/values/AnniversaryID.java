package com.sofkaU.demoDDD.customizedservice.values;

import co.com.sofka.domain.generic.Identity;

public class AnniversaryID extends Identity {
    public AnniversaryID() {
    }

    private AnniversaryID(String uuid) {
        super(uuid);
    }

    public static AnniversaryID of(String id){
        return new AnniversaryID(id);
    }
}
