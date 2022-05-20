package com.sofkaU.demoDDD.customizedservice;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.events.*;
import com.sofkaU.demoDDD.customizedservice.values.*;

import java.util.List;
import java.util.Set;

public class CustomizedService extends AggregateEvent<CustomizedServiceID> {

    protected RestaurantBranchName restaurantBranchName;
    protected Set<Birthday> birthdays;
    protected Set<Anniversary> anniversaries;
    protected Set<Holiday> holidays;

    public CustomizedService(CustomizedServiceID entityId, RestaurantBranchName restaurantBranchName){
        super(entityId);
        appendChange(new CustomizedServiceCreated(restaurantBranchName)).apply();
    }

    private CustomizedService(CustomizedServiceID customizedServiceID){
        super(customizedServiceID);
        subscribe(new CustomizedServiceChange(this));
    }

    public static CustomizedService from(CustomizedServiceID customizedServiceID, List<DomainEvent> events){
        CustomizedService customizedService= new CustomizedService(customizedServiceID);
        events.forEach((event)->customizedService.applyEvent(event));
        return customizedService;
    }

    public void addBirthday(AmountOfGuests amountOfGuests, DateBirth dateBirth){
        var birthdayID=new BirthdayID();
        appendChange(new BirthdayAdded(birthdayID, amountOfGuests,dateBirth)).apply();
    }

    public void addAnniversary(Years years, AmountOfGuests amountOfGuests){
        var anniversaryID=new AnniversaryID();
        appendChange(new AnniversaryAdded(anniversaryID,amountOfGuests,years)).apply();
    }

    public void addHoliday(Name name, ExtraDecoration extraDecoration){
        var holidayID=new HolidayID();
        appendChange(new HolidayAdded(holidayID,extraDecoration,name)).apply();
    }

    public void holidayNameUpdate(Name name){
        appendChange(new HolidayNameUpdated(name)).apply();
    }

    public RestaurantBranchName restaurantBranchName() {
        return restaurantBranchName;
    }

    public Set<Birthday> birthdays() {
        return birthdays;
    }

    public Set<Anniversary> anniversaries() {
        return anniversaries;
    }

    public Set<Holiday> holidays() {
        return holidays;
    }
}
