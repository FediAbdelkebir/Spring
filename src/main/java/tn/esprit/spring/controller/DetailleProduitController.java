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

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.Service.DetailleProduitServiceImpl;

@RestController
@CrossOrigin
public class DetailleProduitController {
	@Autowired
	DetailleProduitServiceImpl CS;
	@PostMapping(value = "/AjouterDetailleProduit")
	public DetailProduit AjouterCustomer(@RequestBody DetailProduit detailleproduit) {
		CS.AjouterDetailleProduits(detailleproduit);
		return detailleproduit; 
	}
	@DeleteMapping(value = "/SupprimerDetailleProduit/{id}")
	public String SupprimerDetailleProduit(@PathVariable(name="id") Long iddetailleproduit) {
		CS.SuppimerDetailleProduit(iddetailleproduit);
		return "DetailleProduit Supprimé"; 
	}
	@RequestMapping(value = "/DetailleProduits")
	@ResponseBody
	public List<DetailProduit> DetailleProduits() {
		return CS.getAllDetailleProduits(); 
	}
	@PutMapping(value = "/UpdateDetailleProduit")
	@ResponseBody
	public Optional<DetailProduit> UpdateDetailleProduits(@RequestBody DetailProduit detailleproduit) {
		CS.updateDetailleProduits(detailleproduit); 
		return CS.FindDetailleProduits(detailleproduit.getIdDetailProduit());
	}
	public DetailleProduitController() {
		// TODO Auto-generated constructor stub
	}

}
