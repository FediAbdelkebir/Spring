package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.ClientService;

@RestController
@RequestMapping("/Client")
@Api(tags = "Client Controller")
public class ClientController {
	@Autowired
	ClientService clientService;
	
	@PostMapping("/add-client")
	@ResponseBody //trajaa retour
	Client addClient(@RequestBody Client c) {
		return clientService.addClient(c);
	}
	  // http://localhost:8089/SpringMVC/Client/add-client //type json
	
	@GetMapping("/show")
	@ResponseBody //trajaa retour
	List<Client> retrieveAll(){
		return clientService.retrieveAllClients();
	}
	  // http://localhost:8089/SpringMVC/Client/show
	
	@PutMapping("/update-client")
	@ResponseBody
	Client updateStock(@RequestBody Client c){
		return clientService.updateClient(c);
	}
	  // http://localhost:8089/SpringMVC/Client/update-client //type json avec id
	
	@DeleteMapping("/delete-client/{id}")
	void deleteClient(@PathVariable(name="id") Long id){
		clientService.deleteClient(id);
	}
	  // http://localhost:8089/SpringMVC/Client/delete-client/id
	
	@GetMapping("/show/{id}")
	@ResponseBody //trajaa retour
	Client retrieveById(@PathVariable Long id){
		return clientService.retrieveClient(id);
	}
	
	
}
