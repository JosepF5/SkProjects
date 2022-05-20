package com.sofkaU.demoDDD.customizedservice.values;

import co.com.sofka.domain.generic.Identity;

public class HolidayID extends Identity {
    public HolidayID() {
    }

    private HolidayID(String uuid) {
        super(uuid);
    }

    public static HolidayID of(String id){
        return new HolidayID(id);
    }
}
