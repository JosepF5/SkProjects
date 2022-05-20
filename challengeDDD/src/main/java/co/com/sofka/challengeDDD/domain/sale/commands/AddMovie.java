package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.Classification;
import co.com.sofka.challengeDDD.domain.sale.values.MovieID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class AddMovie extends Command {
    private final SaleID saleID;
    private final MovieID movieID;
    private final Name name;
    private final Classification classification;

    public AddMovie(SaleID saleID, MovieID movieID, Name name, Classification classification) {
        this.saleID = saleID;
        this.movieID = movieID;
        this.name = name;
        this.classification = classification;
    }

    public SaleID getSaleID() {
        return saleID;
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
