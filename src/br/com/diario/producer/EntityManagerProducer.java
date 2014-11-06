package br.com.diario.producer;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.diario.qualifier.EntityManagerBancoXQualifier;

@RequestScoped
public class EntityManagerProducer {

	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("DiarioPU");
	
	//Era para fazer com o @PersistenceContext(unitName = "DiarioPU") Mas ele não instanciou
//	private @PersistenceContext(unitName = "DiarioPU")
	private EntityManager entityManager;

	public EntityManagerProducer() {
	}

	@Produces
	@RequestScoped
	@EntityManagerBancoXQualifier
	public EntityManager createEntityManager() {
		if(entityManager == null)
			entityManager = emf.createEntityManager();
		
		return entityManager;
	}

	public void dispose(
			@Disposes @EntityManagerBancoXQualifier EntityManager entityManager) {
		System.out.println("EntityManager fechado");
		entityManager.close();
	}
}
