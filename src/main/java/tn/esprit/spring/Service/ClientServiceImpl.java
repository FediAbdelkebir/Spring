package tn.esprit.spring.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.Repository.ClientRepository;

@Slf4j
@Service
public class ClientServiceImpl implements ClientService{
	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public List<Client> retrieveAllClients() {
		List<Client> clients = (List<Client>) clientRepository.findAll();
		for(Client client : clients ){
			log.info("client : " + client);
		}
		return clients;
	}

	@Override
	public Client addClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}

	@Override
	public Client updateClient(Client c) {
		Client client = clientRepository.findById(c.getIdClient()).orElse(null);
		client.setNom(c.getNom());
		client.setPrenom(c.getPrenom());
		client.setDateNaissance(c.getDateNaissance());
		client.setEmail(c.getEmail());
		client.setCategorieClient(c.getCategorieClient());
		client.setProfession(c.getProfession());
		client.setPassword(c.getPassword());
		return clientRepository.save(client);
	}

	@Override
	public Client retrieveClient(Long id) {
		return clientRepository.findById(id).orElse(null);
	}
	
	
	
}
