package tn.esprit.spring.Service;

import java.util.List;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.Model.Client;
import tn.esprit.spring.Repository.ClientRepository;

@Service
@Slf4j
public class ClientServiceImpl {
	@Autowired
	ClientRepository CR;
	public Client AjouterClient(Client client) {
		return CR.save(client);
	}
	public void UpdateClient(Client client) {
		CR.update(client.getIdClient(), client.getDateNaissance(), client.getNom(), client.getPrenom(), client.getPassword(), client.getCategorieClient(), client.getProfession());
	}
	public void SuppimerClient(Client client) {
		CR.delete(client);
		
	}
	public Set<Client> Clients(){
		return (Set<Client>) CR.findAll();
	}
	public Optional<Client> FindClient(Client client) {
		return CR.findById(client.getIdClient());
	}
	public List<Client> FindAllBetween(){
		return CR.findAllClientsBetween();
	}
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return (List<Client>) CR.findAll();
	}

}
