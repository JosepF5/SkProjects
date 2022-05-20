package com.sofkaU.demoDDD.customizedservice.values;

import co.com.sofka.domain.generic.Identity;

public class BirthdayID extends Identity {
    public BirthdayID() {
    }

    private BirthdayID(String uuid) {
        super(uuid);
    }

    public static BirthdayID of(String id){
        return new BirthdayID(id);
    }
}
