package br.com.diario.rest.evento;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;

@Path("s/evento/service")
public class EventoService {

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public User getDefaultUserInJSON() {
//        EventoService userService = new EventoService();
//        return userService.getDefaultUser();
//    }
    
//    @GET
//    @Path("helloworld")
//    public String helloworld() {
//        return "Hello World!";
//    }
//    
//    @GET
//    @Path("helloname/{name}")
//    public String hello(@PathParam("name") final String name) {
//      return "Hello " +name;
//    }

	// TODO criar um response para o retorno dos metodos REST, ver algum padrão da internet ou ver como ficou o do banco
	
	@GET
	@Path("/listar")
	@Produces("application/json")
	@Mapped
	public Eventos listar() {

		ArrayList<Evento> list = new ArrayList<Evento>();

		list.add(new Evento(1, "Academia"));
		list.add(new Evento(2, "Fidello"));
		list.add(new Evento(3, "Besteiras"));

		return new Eventos(list);
	}
	
	@GET
	@Path(value = "gravar")
	@Produces("application/json")
	@Mapped
	public Eventos gravar(@QueryParam(value = "evento") String evento) {

		System.out.println(evento);
		ArrayList<Evento> list = new ArrayList<Evento>();

		list.add(new Evento(1, "Academia"));
		list.add(new Evento(2, "Fidello"));
		list.add(new Evento(3, "Besteiras"));

		return new Eventos(list);
	}
	
//	@GET
//	@Path("gravar/{evento}")
////	@Produces("application/json")
////	@Mapped
//	public String gravar(@QueryParam("evento") String evento) { // TODO mudar para pegar os "Forms/variaveis" direto como objeto
//
//		System.out.println(evento);
//		
//		return "Sucesso";
//		
////		System.out.println(evento.getId());
////		System.out.println(evento.getNome());
//
//	}
    
}