package com.sofkaU.demoDDD.restaurantbranch;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.events.*;
import com.sofkaU.demoDDD.restaurantbranch.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class RestaurantBranch extends AggregateEvent<RestaurantBranchID> {

    protected RestaurantBranchName restaurantBranchName;
    protected Set<Waiter> waiters;
    protected Set<Chef> chefs;
    protected Set<Table> tables;

    public RestaurantBranch(RestaurantBranchID entityId, RestaurantBranchName restaurantBranchName){
        super(entityId);
        appendChange(new RestaurantBranchCreated(restaurantBranchName)).apply();
    }

    private RestaurantBranch(RestaurantBranchID restaurantBranchID){
        super(restaurantBranchID);
        subscribe(new RestaurantBranchChange(this));
    }

    public static RestaurantBranch from(RestaurantBranchID restaurantBranchID, List<DomainEvent> events){
        RestaurantBranch restaurantBranch= new RestaurantBranch(restaurantBranchID);
        events.forEach((event)->restaurantBranch.applyEvent(event));
        return restaurantBranch;
    }

    public void addChef(ChefID chefID, Name name, Area area){
        Objects.requireNonNull(chefID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(area);
        appendChange(new ChefAdded(chefID, name,area)).apply();
    }

    public void updateChefArea(ChefID chefID, Area area){
        Objects.requireNonNull(chefID);
        Objects.requireNonNull(area);
        appendChange(new ChefAreaUpdated(chefID,area)).apply();
    }

    public void updateChefName(Name name,ChefID chefID){
        Objects.requireNonNull(chefID);
        Objects.requireNonNull(name);
        appendChange(new ChefNameUpdated(name,chefID)).apply();
    }

    public void updateDishName(TableID tableID, Location location, AmountOfChairs amountOfChairs){
        Objects.requireNonNull(tableID);
        Objects.requireNonNull(location);
        Objects.requireNonNull(amountOfChairs);
        appendChange(new TableAdded(tableID,location,amountOfChairs)).apply();
    }

    public void changeTableAmountOfChairs(TableID tableID, AmountOfChairs amountOfChairs){
        Objects.requireNonNull(tableID);
        Objects.requireNonNull(amountOfChairs);
        appendChange(new TableAmountOfChairsChanged(tableID,amountOfChairs)).apply();
    }

    public void updateTableLocation(TableID tableID, Location location){
        Objects.requireNonNull(tableID);
        Objects.requireNonNull(location);
        appendChange(new TableLocationUpdated(tableID,location)).apply();
    }

    public void addWaiter(WaiterID waiterID, Name name,Function function){
        Objects.requireNonNull(waiterID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(function);
        appendChange(new WaiterAdded(waiterID,name,function)).apply();
    }

    public void changeWaiterFunction(WaiterID waiterID, Function function){
        Objects.requireNonNull(waiterID);
        Objects.requireNonNull(function);
        appendChange(new WaiterFunctionChanged(waiterID,function)).apply();
    }

    public void updateWaiterName(WaiterID waiterID, Name name){
        Objects.requireNonNull(waiterID);
        Objects.requireNonNull(name);
        appendChange(new WaiterNameUpdated(waiterID,name)).apply();
    }

    public void updateRestaurantBranchName(RestaurantBranchName restaurantBranchName){
        Objects.requireNonNull(restaurantBranchName);
        appendChange(new RestaurantBranchNameUpdated(restaurantBranchName)).apply();
    }

    public RestaurantBranchName restaurantBranchName() {
        return restaurantBranchName;
    }

    public Set<Waiter> waiters() {
        return waiters;
    }

    public Set<Chef> chefs() {
        return chefs;
    }

    public Set<Table> tables() {
        return tables;
    }
}
