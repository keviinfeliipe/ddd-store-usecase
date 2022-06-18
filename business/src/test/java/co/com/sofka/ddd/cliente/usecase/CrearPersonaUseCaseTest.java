package co.com.sofka.ddd.cliente.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.ddd.cliente.command.CrearPersona;
import co.com.sofka.ddd.cliente.event.PersonaCreada;
import co.com.sofka.ddd.cliente.value.Email;
import co.com.sofka.ddd.cliente.value.Nombre;
import co.com.sofka.ddd.cliente.value.PersonaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearPersonaUseCaseTest {

    @Test

    public void crearPersona(){
        //Arr
        var personaId = new PersonaId();
        var nombre = new Nombre("Kevin Vargas");
        var email = new Email("kf11.vargas@gmail.com");
        var comando = new CrearPersona(personaId,nombre,email);
        var usecase = new CrearPersonaUseCase();
        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(comando))
                .orElseThrow(() -> new IllegalArgumentException("Error al ejecutar el comomando"))
                .getDomainEvents();
        //Asset
        var event = (PersonaCreada)events.get(0);
        Assertions.assertEquals("Kevin Vargas", event.getNombre().value());
        Assertions.assertEquals("kf11.vargas@gmail.com", event.getEmail().value());
    }

}