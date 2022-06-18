package co.com.sofka.ddd.cliente.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.ddd.cliente.Persona;
import co.com.sofka.ddd.cliente.command.CrearPersona;
import co.com.sofka.ddd.cliente.value.PersonaId;

public class CrearPersonaUseCase extends UseCase<RequestCommand<CrearPersona>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearPersona> crearPersonaRequestCommand) {
        var comando = crearPersonaRequestCommand.getCommand();
        var user = new Persona(new PersonaId(), comando.getNombre(), comando.getEmail());
        emit().onResponse(new ResponseEvents(user.getUncommittedChanges()));
    }
}
