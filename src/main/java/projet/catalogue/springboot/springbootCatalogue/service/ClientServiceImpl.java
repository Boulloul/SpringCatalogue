package projet.catalogue.springboot.springbootCatalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import projet.catalogue.springboot.springbootCatalogue.dao.ClientDAO;
import projet.catalogue.springboot.springbootCatalogue.model.Client;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientDAO clientDAO;
	
	@Transactional
	@Override
	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return clientDAO.getAllClient();
	}

	@Transactional
	@Override
	public Client getClient(int id) {
		// TODO Auto-generated method stub
		return clientDAO.getClient(id);
	}

	@Transactional
	@Override
	public void saveClient(Client client) {
		clientDAO.saveClient(client);
		
	}

	@Transactional
	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		clientDAO.deleteClient(id);
	}

}
