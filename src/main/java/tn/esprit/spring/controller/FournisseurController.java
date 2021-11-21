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

import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.Service.FournisseurServiceImpl;
@RestController
@CrossOrigin
public class FournisseurController {
	@Autowired
	FournisseurServiceImpl CS;
	@PostMapping(value = "/AjouterFournisseur")
	public Fournisseur AjouterCustomer(@RequestBody Fournisseur fournisseur) {
		CS.AjouterFournisseur(fournisseur);
		return fournisseur; 
	}
	@DeleteMapping(value = "/SupprimerFournisseur/{id}")
	public String SupprimerFournisseur(@PathVariable(name="id") Long idfournisseur) {
		CS.SuppimerFournisseur(idfournisseur);
		return "Fournisseur Supprimé"; 
	}
	@RequestMapping(value = "/Fournisseurs")
	@ResponseBody
	public List<Fournisseur> Fournisseurs() {
		return CS.getAllFournisseurs(); 
	}
	@PutMapping(value = "/UpdateFournisseur")
	@ResponseBody
	public Optional<Fournisseur> UpdateFournisseurs(@RequestBody Fournisseur fournisseur) {
		CS.updateFournisseur(fournisseur); 
		return CS.FindFournisseur(fournisseur.getIdFournisseur());
	}
	public FournisseurController() {
		// TODO Auto-generated constructor stub
	}

}
