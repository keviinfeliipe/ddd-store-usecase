package co.com.sofka.ddd.orden.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoPago implements ValueObject<String> {

    private final String value;

    public TipoPago(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoPago tipoPago = (TipoPago) o;
        return Objects.equals(value, tipoPago.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}