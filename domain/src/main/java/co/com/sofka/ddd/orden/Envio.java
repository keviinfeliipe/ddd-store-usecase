package co.com.sofka.ddd.orden;

import co.com.sofka.ddd.cliente.value.PersonaId;
import co.com.sofka.ddd.orden.value.EnvioId;
import co.com.sofka.ddd.orden.value.FechaEnvio;
import co.com.sofka.ddd.orden.value.Total;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Envio extends AggregateEvent<EnvioId> {
    protected final Set<Item> items;
    protected final Pago pago;
    protected final FechaEnvio fechaEnvio;
    protected final Total total;
    protected final PersonaId personaId;

    public Envio(EnvioId entityId, Set<Item> items, Pago pago, FechaEnvio fechaEnvio, Total total, PersonaId personaId) {
        super(entityId);
        subscribe(new EnvioChange(this));
        //appendChange(new PersonaCreada(nombre,email)).apply();

        this.items = items;
        this.pago = pago;
        this.fechaEnvio = fechaEnvio;
        this.total = total;
        this.personaId = personaId;
    }
}
