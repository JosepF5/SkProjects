package com.sofkaU.demoDDD.customizedservice;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.demoDDD.customizedservice.events.CustomizedServiceCreated;

import java.util.HashSet;

public class CustomizedServiceChange extends EventChange {

    public CustomizedServiceChange(CustomizedService customizedService){
        apply((CustomizedServiceCreated event)->{
            customizedService.restaurantBranchName=event.getRestaurantBranchName();
            customizedService.birthdays=new HashSet<>();
            customizedService.anniversaries=new HashSet<>();
            customizedService.holidays=new HashSet<>();
        });
    }
}
