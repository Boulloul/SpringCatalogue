package projet.catalogue.springboot.springbootCatalogue.service;

import java.util.List;

import projet.catalogue.springboot.springbootCatalogue.model.Client;

public interface ClientService {
	List<Client> getAllClient();
	Client getClient(int id);
	void saveClient(Client client);
	void deleteClient(int id);
}
