package co.com.sofka.challengeDDD.domain.sale;

import co.com.sofka.challengeDDD.domain.sale.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class SaleChange extends EventChange {
    public SaleChange(Sale sale) {
        apply((SaleCreated event)->{
            sale.payment= event.getPayment();
            sale.clients=new HashSet<>();
            sale.employees=new HashSet<>();
            sale.movies=new HashSet<>();
            sale.lounges=new HashSet<>();
        });

        apply((ClientAdded event) -> {
            var amountOfClients = sale.clients().size();
            if (amountOfClients > 10) {
                throw new IllegalArgumentException("Can't create more clients");
            }
            sale.clients.add(new Client(
                    event.getClientID(),
                    event.getName(),
                    event.getStatus()
            ));
        });

        apply((EmployeeAdded event) -> {
            var amountOfEmployees = sale.employees.size();
            if (amountOfEmployees > 5) {
                throw new IllegalArgumentException("Can't create more employees");
            }
            sale.employees.add(new Employee(
                    event.getEmployeeID(),
                    event.getName(),
                    event.getHierarchy()
            ));
        });

        apply((LoungeAdded event) -> {
            var amountOfLounges = sale.lounges.size();
            if (amountOfLounges > 8) {
                throw new IllegalArgumentException("Can't create more lounges");
            }
            sale.lounges.add(new Lounge(
                    event.getLoungeID(),
                    event.getEffects(),
                    event.getAmountOfSeats()
            ));
        });

        apply((MovieAdded event) -> {
            var amountOfMovies = sale.movies.size();
            if (amountOfMovies > 5) {
                throw new IllegalArgumentException("Can't create more movies");
            }
            sale.movies.add(new Movie(
                    event.getMovieID(),
                    event.getName(),
                    event.getClassification()
            ));
        });

        apply((PaymentUpdated event) -> sale.payment = event.getPayment());

        apply((ClientNameUpdated event) -> {
            var function = sale.getClientById(event.getClientID())
                    .orElseThrow(() -> new IllegalArgumentException("Client not found"));
            function.updateName(event.getName());
        });

        apply((ClientStatusChanged event) -> {
            var function = sale.getClientById(event.getClientID())
                    .orElseThrow(() -> new IllegalArgumentException("Client not found"));
            function.updateStatus(event.getStatus());
        });

        apply((EmployeeHierarchyChanged event) -> {
            var function = sale.getEmployeeById(event.getEmployeeID())
                    .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
            function.updateHierarchy(event.getHierarchy());
        });

        apply((EmployeeNameUpdated event) -> {
            var function = sale.getEmployeeById(event.getEmployeeID())
                    .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
            function.updateName(event.getName());
        });

        apply((LoungeAmountOfSeatsChanged event) -> {
            var function = sale.getLoungeById(event.getLoungeID())
                    .orElseThrow(() -> new IllegalArgumentException("Lounge not found"));
            function.updateAmountOfSeats(event.getAmountOfSeats());
        });

        apply((LoungeEffectsUpdated event) -> {
            var function = sale.getLoungeById(event.getLoungeID())
                    .orElseThrow(() -> new IllegalArgumentException("Lounge not found"));
            function.updateEffects(event.getEffects());
        });

        apply((MovieClassificationChanged event) -> {
            var function = sale.getMovieById(event.getMovieID())
                    .orElseThrow(() -> new IllegalArgumentException("Movie not found"));
            function.updateClassification(event.getClassification());
        });


        apply((MovieNameUpdated event) -> {
            var function = sale.getMovieById(event.getMovieID())
                    .orElseThrow(() -> new IllegalArgumentException("Movie not found"));
            function.updateName(event.getName());
        });
    }
}
