package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entity.Client;

public interface ClientService {
	List<Client> retrieveAllClients();
	Client addClient(Client c);
	void deleteClient(Long id);
	Client updateClient(Client c);
	Client retrieveClient(Long id);
}
