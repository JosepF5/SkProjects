package co.com.sofka.challengeDDD.domain.food.values;

import co.com.sofka.domain.generic.Identity;

public class AppetizerID extends Identity {
    public AppetizerID() {
    }

    private AppetizerID(String uuid) {
        super(uuid);
    }

    public static AppetizerID of(String id){
        return new AppetizerID(id);
    }
}
