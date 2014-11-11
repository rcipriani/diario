package br.com.diario.rest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.diario.mb.User;
import br.com.diario.service.EventoService;


@Path("/users")
public class EventoRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON() {
        EventoService userService = new EventoService();
        return userService.getDefaultUser();
    }
}