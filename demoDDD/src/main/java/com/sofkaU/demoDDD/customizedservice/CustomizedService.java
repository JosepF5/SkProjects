package com.sofkaU.demoDDD.customizedservice;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.events.*;
import com.sofkaU.demoDDD.customizedservice.values.*;

import java.util.List;
import java.util.Objects;
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

    public void addBirthday( BirthdayID birthdayID, AmountOfGuests amountOfGuests, DateBirth dateBirth){
        Objects.requireNonNull(birthdayID);
        Objects.requireNonNull(amountOfGuests);
        Objects.requireNonNull(dateBirth);
        appendChange(new BirthdayAdded(birthdayID, amountOfGuests,dateBirth)).apply();
    }

    public void addAnniversary(AnniversaryID anniversaryID, Years years, AmountOfGuests amountOfGuests){
        Objects.requireNonNull(anniversaryID);
        Objects.requireNonNull(amountOfGuests);
        Objects.requireNonNull(years);
        appendChange(new AnniversaryAdded(anniversaryID,amountOfGuests,years)).apply();
    }

    public void changeAnniversaryAmountOfGuests(AnniversaryID anniversaryID, AmountOfGuests amountOfGuests){
        Objects.requireNonNull(anniversaryID);
        Objects.requireNonNull(amountOfGuests);
        appendChange(new AnniversaryAmountOfGuestsChanged(anniversaryID,amountOfGuests)).apply();
    }

    public void updateAnniversaryYears(AnniversaryID anniversaryID, Years years){
        Objects.requireNonNull(anniversaryID);
        Objects.requireNonNull(years);
        appendChange(new AnniversaryYearsUpdated(anniversaryID,years)).apply();
    }

    public void changeBirthdayAmountOfGuests(BirthdayID birthdayID, AmountOfGuests amountOfGuests){
        Objects.requireNonNull(birthdayID);
        Objects.requireNonNull(amountOfGuests);
        appendChange(new BirthdayAmountOfGuestsChanged(birthdayID,amountOfGuests)).apply();
    }

    public void updateBirthdayDateBirth(BirthdayID birthdayID, DateBirth dateBirth){
        Objects.requireNonNull(birthdayID);
        Objects.requireNonNull(dateBirth);
        appendChange(new BirthdayDateBirthUpdated(birthdayID,dateBirth)).apply();
    }

    public void changeHolidayExtraDecoration(HolidayID holidayID,ExtraDecoration extraDecoration){
        Objects.requireNonNull(holidayID);
        Objects.requireNonNull(extraDecoration);
        appendChange(new HolidayExtraDecorationChanged(holidayID,extraDecoration)).apply();
    }

    public void updateHolidayName(HolidayID holidayID, Name name){
        Objects.requireNonNull(holidayID);
        Objects.requireNonNull(name);
        appendChange(new HolidayNameUpdated(holidayID,name)).apply();
    }

    public void updateRestaurantBranchName(CustomizedServiceID customizedServiceID, RestaurantBranchName restaurantBranchName){
        Objects.requireNonNull(customizedServiceID);
        Objects.requireNonNull(restaurantBranchName);
        appendChange(new RestaurantBranchNameUpdated(customizedServiceID, restaurantBranchName)).apply();
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
