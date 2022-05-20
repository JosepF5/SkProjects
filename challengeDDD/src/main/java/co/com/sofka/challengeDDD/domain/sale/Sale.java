package co.com.sofka.challengeDDD.domain.sale;

import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.challengeDDD.domain.sale.values.EmployeeID;
import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Sale extends AggregateEvent<SaleID> {
    protected Payment payment;
    protected Set<Client> clients;
    protected Set<Employee> employees;
    protected Set<Movie> movies;
    protected Set<Lounge> lounges;

    public Sale(SaleID entityId, Payment payment) {
        super(entityId);
        appendChange(new SaleCreated(payment)).apply();
    }

    public Sale(SaleID entityId) {
        super(entityId);
        subscribe(new SaleChange(this));
    }

    public static Sale from(SaleID saleID, List<DomainEvent> events){
        var sale = new Sale(saleID);
        events.forEach(sale::applyEvent);
        return sale;
    }

    public Payment payment() {
        return payment;
    }

    public Set<Client> clients() {
        return clients;
    }

    public Set<Employee> employees() {
        return employees;
    }

    public Set<Movie> movies() {
        return movies;
    }

    public Set<Lounge> lounges() {
        return lounges;
    }
}
