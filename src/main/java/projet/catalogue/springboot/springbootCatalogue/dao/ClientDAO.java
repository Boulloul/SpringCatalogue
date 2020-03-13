package projet.catalogue.springboot.springbootCatalogue.dao;

import java.util.List;

import projet.catalogue.springboot.springbootCatalogue.model.Client;

public interface ClientDAO {
	List<Client> getAllClient();
	Client getClient(int id);
	void saveClient(Client client);
	void deleteClient(int id);
	
}
