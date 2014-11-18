package br.com.diario.rest.evento;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
 
@XmlRootElement(name="eventos")
public class Eventos
{
    private List<Evento> testes;
 
    public Eventos()
    {
    }
 
    public Eventos(List<Evento> testes)
    {
        this.testes = testes;
    }
 
    @XmlElement(name="lista")
    public List<Evento> getTestes()
    {
        return testes;
    }
}