package co.com.sofka.ddd.orden;

import co.com.sofka.domain.generic.EventChange;

public class EnvioChange extends EventChange {
    public EnvioChange(Envio envio) {
        apply((EnvioCreado event->{

        }));
    }
}
