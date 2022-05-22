package com.sofkaU.demoDDD.customizedservice.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ExtraDecoration implements ValueObject<String> {
    private final String value;

    public ExtraDecoration(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The ExtraDecoration cant be in blank");
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
        ExtraDecoration that=(ExtraDecoration) o;
        return Objects.equals(value,that.value);
    }
}
