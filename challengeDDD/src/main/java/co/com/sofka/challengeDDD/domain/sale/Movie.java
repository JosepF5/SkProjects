package co.com.sofka.challengeDDD.domain.sale;

import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.challengeDDD.domain.sale.values.Classification;
import co.com.sofka.challengeDDD.domain.sale.values.MovieID;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Movie extends Entity<MovieID> {
    private Name name;
    private Classification classification;

    public Movie(MovieID entityId, Name name, Classification classification) {
        super(entityId);
        this.name = name;
        this.classification = classification;
    }

    public void updateName(Name name) {
        this.name= Objects.requireNonNull(name);
    }

    public void updateClassification(Classification classification) {
        this.classification= Objects.requireNonNull(classification);
    }

    public Name name() {
        return name;
    }

    public Classification classification() {
        return classification;
    }
}
