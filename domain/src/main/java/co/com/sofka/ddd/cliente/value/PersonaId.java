package co.com.sofka.ddd.cliente.value;

import co.com.sofka.domain.generic.Identity;

public class PersonaId extends Identity {

    public PersonaId(String uuid) {
        super(uuid);
    }

    public PersonaId() {
    }

    public static PersonaId of(String id){
        return new PersonaId(id);
    }

}
