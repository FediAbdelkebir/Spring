package tn.esprit.spring.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.Service.FactureServiceImpl;

@RestController
@CrossOrigin
public class FactureController {
	@Autowired
	FactureServiceImpl CS;
	@PostMapping(value = "/AjouterFacture")
	public Facture AjouterCustomer(@RequestBody Facture facture) {
		CS.AjouterFacture(facture);
		return facture; 
	}
	@DeleteMapping(value = "/SupprimerFacture/{id}")
	public String SupprimerFacture(@PathVariable(name="id") Long idfacture) {
		CS.SuppimerFacture(idfacture);
		return "Facture Supprimé"; 
	}
	@RequestMapping(value = "/Factures")
	@ResponseBody
	public List<Facture> Factures() {
		return CS.retrieveAllFactures(); 
	}/*
	@PutMapping(value = "/UpdateFacture")
	@ResponseBody
	public Optional<Facture> UpdateFactures(@RequestBody Facture facture) {
		CS.updateFacture(facture); 
		return CS.retrieveFacture(facture.getIdFacture());
	}*/
	public FactureController() {
		// TODO Auto-generated constructor stub
	}

}
