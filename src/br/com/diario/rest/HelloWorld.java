package br.com.diario.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
 
@Path("s/tutorial")
public class HelloWorld
{
 
    @GET
    @Path("helloworld")
    public String helloworld() {
        return "Hello World!";
    }
    
    @GET
    @Path("helloname/{name}")
    public String hello(@PathParam("name") final String name) {
      return "Hello " +name;
    }
    
	@GET
	@Path("testes")
	@Produces("application/json")
	@Mapped
	public TesteList getJSONItems() {

		ArrayList<Teste> list = new ArrayList<Teste>();

		list.add(new Teste("Rodrigo", "eu@teste.com", 29, true));
		list.add(new Teste("Rodrigo1", "eu1@teste.com", 291, false));
		list.add(new Teste("Rodrigo2", "eu2@teste.com", 292, true));

		return new TesteList(list);
	}
}