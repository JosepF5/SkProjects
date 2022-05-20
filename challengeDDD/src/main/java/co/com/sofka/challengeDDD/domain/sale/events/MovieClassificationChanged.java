package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.Classification;
import co.com.sofka.challengeDDD.domain.sale.values.MovieID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class MovieClassificationChanged extends DomainEvent {
    private final MovieID movieID;
    private final Classification classification;

    public MovieClassificationChanged(MovieID movieID, Classification classification) {
        super("com.sale.movieclassificationchanged");
        this.movieID = movieID;
        this.classification = classification;
    }

    public MovieID getMovieID() {
        return movieID;
    }

    public Classification getClassification() {
        return classification;
    }
}
