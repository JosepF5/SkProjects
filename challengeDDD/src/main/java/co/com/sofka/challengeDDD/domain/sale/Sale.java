package co.com.sofka.challengeDDD.domain.sale;

import co.com.sofka.challengeDDD.domain.sale.events.*;
import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import javax.management.Notification;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
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

    public void notifyAccountingDpmt(String message){
        Objects.requireNonNull(message);
        appendChange(new AccontingNotificationSent(message)).apply();
    }

    public void notifyTicketBatch(String message){
        Objects.requireNonNull(message);
        appendChange(new TicketBatchNotificationSent(message)).apply();
    }

    public void updatePayment(Payment payment){
        Objects.requireNonNull(payment);
        appendChange(new PaymentUpdated(payment)).apply();
    }

    public void addClient(ClientID clientID, Name name, Status status){
        Objects.requireNonNull(clientID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(status);
        appendChange(new ClientAdded(clientID,name,status)).apply();
    }

    public void addEmployee(EmployeeID employeeID, Name name, Hierarchy hierarchy){
        Objects.requireNonNull(employeeID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(hierarchy);
        appendChange(new EmployeeAdded(employeeID,name,hierarchy)).apply();
    }

    public void addMovie(MovieID movieID, Name name, Classification classification){
        Objects.requireNonNull(movieID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(classification);
        appendChange(new MovieAdded(movieID,name,classification)).apply();
    }

    public void addLounge(LoungeID loungeID, AmountOfSeats amountOfSeats, Effects effects){
        Objects.requireNonNull(loungeID);
        Objects.requireNonNull(amountOfSeats);
        Objects.requireNonNull(effects);
        appendChange(new LoungeAdded(loungeID,amountOfSeats,effects)).apply();
    }

    public void updateClientName(ClientID clientID, Name name){
        Objects.requireNonNull(clientID);
        Objects.requireNonNull(name);
        appendChange(new ClientNameUpdated(clientID,name)).apply();
    }

    public void updateEmployeeName(EmployeeID employeeID, Name name){
        Objects.requireNonNull(employeeID);
        Objects.requireNonNull(name);
        appendChange(new EmployeeNameUpdated(employeeID,name)).apply();
    }

    public void updateMovieName(MovieID movieID, Name name){
        Objects.requireNonNull(movieID);
        Objects.requireNonNull(name);
        appendChange(new MovieNameUpdated(movieID,name)).apply();
    }

    public void updateLoungeEffects(LoungeID loungeID, Effects effects){
        Objects.requireNonNull(loungeID);
        Objects.requireNonNull(effects);
        appendChange(new LoungeEffectsUpdated(loungeID,effects)).apply();
    }

    public void changeClientStatus(ClientID clientID, Status status){
        Objects.requireNonNull(clientID);
        Objects.requireNonNull(status);
        appendChange(new ClientStatusChanged(clientID,status)).apply();
    }

    public void changeEmployeeHierarchy(EmployeeID employeeID, Hierarchy hierarchy){
        Objects.requireNonNull(employeeID);
        Objects.requireNonNull(hierarchy);
        appendChange(new EmployeeHierarchyChanged(employeeID,hierarchy)).apply();
    }

    public void changeMovieClassification(MovieID movieID, Classification classification){
        Objects.requireNonNull(movieID);
        Objects.requireNonNull(classification);
        appendChange(new MovieClassificationChanged(movieID,classification)).apply();
    }

    public void changeLoungeAmountOfSeats(LoungeID loungeID, AmountOfSeats amountOfSeats){
        Objects.requireNonNull(loungeID);
        Objects.requireNonNull(amountOfSeats);
        appendChange(new LoungeAmountOfSeatsChanged(loungeID,amountOfSeats)).apply();
    }

    public Optional<Client> getClientById(ClientID entityId) {
        return clients()
                .stream()
                .filter(client -> client.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Employee> getEmployeeById(EmployeeID entityId) {
        return employees()
                .stream()
                .filter(employee -> employee.identity().equals(entityId))
                .findFirst();
    }
    public Optional<Lounge> getLoungeById(LoungeID entityId) {
        return lounges()
                .stream()
                .filter(lounge -> lounge.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Movie> getMovieById(MovieID entityId) {
        return movies()
                .stream()
                .filter(movie -> movie.identity().equals(entityId))
                .findFirst();
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
