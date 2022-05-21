package co.com.sofka.challengeDDD.domain.sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Effects implements ValueObject<String> {
    private final String value;

    public Effects(String value){
        this.value= Objects.requireNonNull(value);
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
        Effects that=(Effects) o;
        return Objects.equals(value,that.value);
    }
}
