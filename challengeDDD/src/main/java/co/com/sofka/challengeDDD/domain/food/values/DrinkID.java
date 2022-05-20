package co.com.sofka.challengeDDD.domain.food.values;

import co.com.sofka.domain.generic.Identity;

public class DrinkID extends Identity {
    public DrinkID() {
    }

    private DrinkID(String uuid) {
        super(uuid);
    }

    public static DrinkID of(String id){
        return new DrinkID(id);
    }
}
