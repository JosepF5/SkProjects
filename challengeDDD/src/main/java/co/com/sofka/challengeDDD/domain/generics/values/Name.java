package co.com.sofka.challengeDDD.domain.generics.values;

import co.com.sofka.domain.generic.ValueObject;

public class Name implements ValueObject<String> {

    private final String value;

    public Name(String value) {
        this.value = value;
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Debe ingresar un valor");
        }
    }

    @Override
    public String value() {
        return null;
    }
}
