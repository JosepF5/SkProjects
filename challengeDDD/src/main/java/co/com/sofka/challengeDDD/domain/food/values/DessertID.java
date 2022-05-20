package co.com.sofka.challengeDDD.domain.food.values;

import co.com.sofka.domain.generic.Identity;

public class DessertID extends Identity {
    public DessertID() {
    }

    private DessertID(String uuid) {
        super(uuid);
    }

    public static DessertID of(String id){
        return new DessertID(id);
    }
}
