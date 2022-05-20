package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.Classification;
import co.com.sofka.challengeDDD.domain.sale.values.MovieID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class MovieNameUpdated extends DomainEvent {
    private final MovieID movieID;
    private final Name name;

    public MovieNameUpdated(MovieID movieID, Name name) {
        super("com.sale.movienameupdated");
        this.movieID = movieID;
        this.name = name;
    }

    public MovieID getMovieID() {
        return movieID;
    }

    public Name getName() {
        return name;
    }

}
