package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.Classification;
import co.com.sofka.challengeDDD.domain.sale.values.MovieID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class ChangeMovieClassification extends Command {
    private final SaleID saleID;
    private final MovieID movieID;
    private final Classification classification;

    public ChangeMovieClassification(SaleID saleID, MovieID movieID, Classification classification) {
        this.saleID = saleID;
        this.movieID = movieID;
        this.classification = classification;
    }

    public SaleID getSaleID() {
        return saleID;
    }

    public MovieID getMovieID() {
        return movieID;
    }

    public Classification getClassification() {
        return classification;
    }
}
