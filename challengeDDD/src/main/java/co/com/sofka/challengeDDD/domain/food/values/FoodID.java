package co.com.sofka.challengeDDD.domain.food.values;

import co.com.sofka.domain.generic.Identity;

public class FoodID extends Identity {
    public FoodID() {
    }

    private FoodID(String uuid) {
        super(uuid);
    }

    public static FoodID of(String id){
        return new FoodID(id);
    }
}
