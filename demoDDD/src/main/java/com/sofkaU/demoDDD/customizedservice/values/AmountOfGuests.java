package com.sofkaU.demoDDD.customizedservice.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AmountOfGuests implements ValueObject<Integer> {
    private final Integer value;

    public AmountOfGuests(Integer value){
        this.value= Objects.requireNonNull(value);
        if(this.value < 0){
            throw new IllegalArgumentException("The AmountOfGuests cant be negative");
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
        AmountOfGuests that=(AmountOfGuests) o;
        return Objects.equals(value,that.value);
    }
}
