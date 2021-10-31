package tn.esprit.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Repository.ClientRepository;
import tnesprit.Model.Client;

@Service
public class ClientServiceImpl {
	@Autowired
	ClientRepository CR;
	public void AjouterClient(Client client) {
		CR.save(client);
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

}
