package br.com.diario.service;

import br.com.diario.mb.User;

public class EventoService {

    public User getDefaultUser() {
        User user = new User();
        user.setFirstName("JonFromREST");
        user.setLastName("DoeFromREST");
        return user;
    }
}