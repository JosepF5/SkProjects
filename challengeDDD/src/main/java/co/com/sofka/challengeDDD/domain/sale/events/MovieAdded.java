package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class MovieAdded extends DomainEvent {
    private final MovieID movieID;
    private final Name name;
    private final Classification classification;

    public MovieAdded(MovieID movieID, Name name, Classification classification) {
        super("com.sale.movieadded");
        this.movieID = movieID;
        this.name = name;
        this.classification = classification;
    }

    public MovieID getMovieID() {
        return movieID;
    }

    public Name getName() {
        return name;
    }

    public Classification getClassification() {
        return classification;
    }
}
