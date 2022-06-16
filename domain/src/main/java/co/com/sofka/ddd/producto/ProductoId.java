package co.com.sofka.ddd.producto;

import co.com.sofka.domain.generic.Identity;

public class ProductoId extends Identity {
    private ProductoId(String uuid) {
        super(uuid);
    }

    public ProductoId() {
    }

    public static ProductoId of(String id){
        return new ProductoId(id);
    }
}
