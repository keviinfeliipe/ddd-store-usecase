package co.com.sofka.ddd.producto.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Integer> {
    private final Integer value;

    public Precio(Integer value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
