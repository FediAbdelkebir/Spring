package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entity.Produit;

public interface ProduitService {
	List<Produit> retrieveAllProduits();
	Produit addProduit(Produit p, Long idRayon, Long idStock);
	Produit retrieveProduit(Long id);
	void assignProduitToStock(Long idProduit, Long idStock);
	void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}
