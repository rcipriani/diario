package br.com.diario.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
 


import br.com.diario.rest.HelloWorld;
 
public class HelloWorldApplication extends Application
{
    private Set<Object> singletons = new HashSet();
    private Set<Class<?>> empty = new HashSet();
 
    public HelloWorldApplication() {
        // ADD YOUR RESTFUL RESOURCES HERE
        this.singletons.add(new HelloWorld());
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