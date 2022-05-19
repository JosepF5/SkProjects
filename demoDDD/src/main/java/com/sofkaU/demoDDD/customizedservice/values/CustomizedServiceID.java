package com.sofkaU.demoDDD.customizedservice.values;

import co.com.sofka.domain.generic.Identity;

public class CustomizedServiceID extends Identity {

    public CustomizedServiceID() {
    }

    private CustomizedServiceID(String uuid) {
        super(uuid);
    }

    public static CustomizedServiceID of(String id){
        return new CustomizedServiceID(id);
    }
}