package projet.catalogue.springboot.springbootCatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projet.catalogue.springboot.springbootCatalogue.model.Client;
import projet.catalogue.springboot.springbootCatalogue.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping("/getclients")
	public List<Client> getAllClients(){
		return clientService.getAllClient();
		
	}
	
	@PostMapping("/addclient")
	public Client saveClient(@RequestBody Client clientObj) {
		clientService.saveClient(clientObj);
		return clientObj;
	}
	
	@GetMapping("/getclient/{id}")
	public Client getClient(@PathVariable int id) {
		return clientService.getClient(id);
	}
	
	@PutMapping("/putclient")
	public Client updateClient(@RequestBody Client client) {
		clientService.saveClient(client);
		return client;
		
	}
	
	@DeleteMapping("/deleteclient/{id}")
	public String deleteClient(@PathVariable int id) {
		clientService.deleteClient(id);
		return "Client supprimer avec succées";
	}
}
