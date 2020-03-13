package projet.catalogue.springboot.springbootCatalogue.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.websocket.Session;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import projet.catalogue.springboot.springbootCatalogue.model.Client;

@Repository
public class ClientDAOImpl implements ClientDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	
	
	
	@Override
	public List<Client> getAllClient() {
		org.hibernate.Session currentSession=entityManager.unwrap(org.hibernate.Session.class);
		Query<Client> query=currentSession.createQuery("from Client",Client.class);
     	List<Client> list=query.getResultList();
     	System.out.println(list);
		return list;
	}

	@Override
	public Client getClient(int id) {
		// TODO Auto-generated method stub
		org.hibernate.Session currentSession=entityManager.unwrap(org.hibernate.Session.class);
		Client client=currentSession.get(Client.class, id);
		return client;
	}

	@Override
	public void saveClient(Client client) {
		// TODO Auto-generated method stub
		org.hibernate.Session currentSession=entityManager.unwrap(org.hibernate.Session.class);
		currentSession.saveOrUpdate(client);
		
		
	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		org.hibernate.Session currentSession=entityManager.unwrap(org.hibernate.Session.class);
		Client client=currentSession.get(Client.class,id);
		currentSession.delete(client);
		
	}

}
