package co.com.sofka.challengeDDD.domain.sale.values;

import co.com.sofka.domain.generic.Identity;

public class MovieID extends Identity {
    public MovieID() {
    }

    private MovieID(String uuid) {
        super(uuid);
    }

    public static MovieID of(String id){
        return new MovieID(id);
    }
}
