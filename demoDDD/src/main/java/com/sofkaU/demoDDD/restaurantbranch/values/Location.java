package com.sofkaU.demoDDD.restaurantbranch.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofkaU.demoDDD.customizedservice.values.RestaurantBranchName;

import java.util.Objects;

public class Location implements ValueObject<String> {
    private final String value;

    public Location(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The Location cant be in blank");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public int hashCode(){
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null||getClass()!=o.getClass()) return false;
        Location that=(Location) o;
        return Objects.equals(value,that.value);
    }
}
