package co.com.sofka.challengeDDD.domain.food.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Payment implements ValueObject<Integer> {
    private final Integer value;

    public Payment(Integer value){
        this.value= Objects.requireNonNull(value);
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
        Payment that=(Payment) o;
        return Objects.equals(value,that.value);
    }
}
