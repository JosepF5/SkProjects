package com.sofkaU.demoDDD.food.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofkaU.demoDDD.customizedservice.values.RestaurantBranchName;

import java.util.Objects;

public class Type implements ValueObject<String> {
    private final String value;

    public Type(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The Type cant be in blank");
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
        Type that=(Type) o;
        return Objects.equals(value,that.value);
    }
}
