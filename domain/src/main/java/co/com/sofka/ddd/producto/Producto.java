package co.com.sofka.ddd.producto;

import co.com.sofka.domain.generic.AggregateEvent;

public class Producto extends AggregateEvent<ProductoId> {
    public Producto(ProductoId entityId) {
        super(entityId);
    }
}
