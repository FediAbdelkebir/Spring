package tn.esprit.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.Service.ProduitService;

@RestController
@RequestMapping("Produit")
@Api(tags = "Produit Controller")
public class ProduitController {
	
	@Autowired
	ProduitService produitService;
	
	@GetMapping("/show")
	@ResponseBody //trajaa retour
	List<Produit> retrieveAll(){
		return produitService.retrieveAllProduits();
	}

	@PostMapping("/add-produit/{idRayon}/{idStock}")
	@ResponseBody //trajaa retour
	Produit addProduit(@RequestBody Produit p, @PathVariable("idRayon") Long idRayon, @PathVariable("idStock") Long idStock) {
		return produitService.addProduit(p, idRayon, idStock);
	}

	@PutMapping("/update-produit/{idProduit}/{idStock}")
	@ResponseBody //trajaa retour
	void prodToStock(@PathVariable Long idProduit, @PathVariable Long idStock){
		produitService.assignProduitToStock(idProduit, idStock);
	}
	
	@PostMapping("/add-produit/{idProduit}/fournisseur/{idFournisseur}")
	@ResponseBody
	void fournToProd(@PathVariable Long idProduit, @PathVariable Long idFournisseur){
		produitService.assignFournisseurToProduit(idFournisseur, idProduit);
	}
	
}
