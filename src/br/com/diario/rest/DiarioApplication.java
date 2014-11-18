package br.com.diario.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import br.com.diario.rest.evento.EventoService;
 
public class DiarioApplication extends Application
{
    private Set<Object> singletons = new HashSet();
    private Set<Class<?>> empty = new HashSet();
 
    public DiarioApplication() {
        // ADD YOUR RESTFUL RESOURCES HERE
        this.singletons.add(new EventoService());
    }
 
    public Set<Class<?>> getClasses()
    {
        return this.empty;
    }
 
    public Set<Object> getSingletons()
    {
        return this.singletons;
    }
}