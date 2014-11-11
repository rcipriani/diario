package br.com.diario.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
 
@XmlRootElement(name="listing")
public class TesteList
{
    private List<Teste> testes;
 
    public TesteList()
    {
    }
 
    public TesteList(List<Teste> testes)
    {
        this.testes = testes;
    }
 
    @XmlElement(name="testes")
    public List<Teste> getTestes()
    {
        return testes;
    }
}