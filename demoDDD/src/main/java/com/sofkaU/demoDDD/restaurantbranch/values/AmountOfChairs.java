package com.sofkaU.demoDDD.restaurantbranch.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AmountOfChairs implements ValueObject<Integer> {
    private final Integer value;

    public AmountOfChairs(Integer value){
        this.value= Objects.requireNonNull(value);
        if(this.value < 0){
            throw new IllegalArgumentException("The AmountOfChairs cant be negative");
        }
    }

    public Integer value() {
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
        AmountOfChairs that=(AmountOfChairs) o;
        return Objects.equals(value,that.value);
    }
}
