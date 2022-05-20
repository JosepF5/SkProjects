package com.sofkaU.demoDDD.restaurantbranch;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.events.*;
import com.sofkaU.demoDDD.restaurantbranch.values.*;

import java.util.List;
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

    public void addWaiter(Name name, Function function){
        var waiterID=new WaiterID();
        appendChange(new WaiterAdded(waiterID, name,function)).apply();
    }

    public void addChef(Name name, Area area){
        var chefID=new ChefID();
        appendChange(new ChefAdded(chefID,name,area)).apply();
    }

    public void addTable(Location location, AmountOfChairs amountOfChairs){
        var tableID=new TableID();
        appendChange(new TableAdded(tableID,location,amountOfChairs)).apply();
    }

    public void dishNameUpdate(Name name){
        appendChange(new WaiterNameUpdated(name)).apply();
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
