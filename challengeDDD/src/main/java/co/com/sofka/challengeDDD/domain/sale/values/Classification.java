package co.com.sofka.challengeDDD.domain.sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Classification implements ValueObject<Integer> {
    private final Integer value;

    public Classification(Integer value){
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
        Classification that=(Classification) o;
        return Objects.equals(value,that.value);
    }
}
