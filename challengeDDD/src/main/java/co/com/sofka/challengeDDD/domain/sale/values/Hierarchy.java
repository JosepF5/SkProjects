package co.com.sofka.challengeDDD.domain.sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Hierarchy implements ValueObject<String> {
    private final String value;

    public Hierarchy(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The hierarchy cant be in blank");
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
        Hierarchy that=(Hierarchy) o;
        return Objects.equals(value,that.value);
    }
}
