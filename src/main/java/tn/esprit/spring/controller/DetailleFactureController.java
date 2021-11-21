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

import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.Service.DetailleFactureServiceImpl;

@RestController
@CrossOrigin
public class DetailleFactureController {
	@Autowired
	DetailleFactureServiceImpl CS;
	@PostMapping(value = "/AjouterDetailleFacture")
	public DetailFacture AjouterCustomer(@RequestBody DetailFacture detaillefacture) {
		CS.AjouterDetailleFactures(detaillefacture);
		return detaillefacture; 
	}
	@DeleteMapping(value = "/SupprimerDetailleFacture/{id}")
	public String SupprimerDetailleFacture(@PathVariable(name="id") Long iddetaillefacture) {
		CS.SuppimerDetailleFacture(iddetaillefacture);
		return "DetailleFacture Supprimé"; 
	}
	@RequestMapping(value = "/DetailleFactures")
	@ResponseBody
	public List<DetailFacture> DetailleFactures() {
		return CS.getAllDetailleFactures(); 
	}
	@PutMapping(value = "/UpdateDetailleFacture")
	@ResponseBody
	public Optional<DetailFacture> UpdateDetailleFactures(@RequestBody DetailFacture detaillefacture) {
		CS.updateDetailleFactures(detaillefacture); 
		return CS.FindDetailleFactures(detaillefacture.getIdDetailFacture());
	}
	public DetailleFactureController() {
		// TODO Auto-generated constructor stub
	}

}
