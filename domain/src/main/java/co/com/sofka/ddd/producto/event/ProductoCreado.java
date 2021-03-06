package co.com.sofka.ddd.producto.event;

import co.com.sofka.ddd.producto.value.CategoriaId;
import co.com.sofka.ddd.producto.value.Nombre;
import co.com.sofka.ddd.producto.value.Precio;
import co.com.sofka.ddd.producto.value.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoCreado extends DomainEvent {
    private final CategoriaId categoriaId;
    private final ProveedorId proveedorId;
    private final Nombre nombre;
    private final Precio precio;

    public ProductoCreado(CategoriaId categoriaId, ProveedorId proveedorId, Nombre nombre, Precio precio) {
        super("producto.ProductoCreado");
        this.categoriaId = categoriaId;
        this.proveedorId = proveedorId;
        this.nombre = nombre;
        this.precio = precio;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Precio getPrecio() {
        return precio;
    }
}
