package tn.esprit.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Repository.DetailleProduitRepository;
import tn.esprit.Repository.ProductRepository;
import tnesprit.Model.DetailProduit;
import tnesprit.Model.Produit;
@Service
public class ProductServiceImpl {

	@Autowired
	ProductRepository CR;
	@Autowired
	DetailleProduitRepository DPR;
	public void AjouterProduit(Produit produit,Long RayonId,Long Stockid) {
		DetailProduit DP = new DetailProduit();
		Long MS= System.currentTimeMillis();
		DP.setDateCreation(new Date(MS));
		DP.setDateDerniereModification(new Date(MS));
		//Enumerate
		//DP.setCategorieProduit();
		CR.save(produit);
		DPR.save(DP);
		CR.InsertRayonStock(produit.getIdProduit(),RayonId,Stockid);
		
	}
	public Set<Produit> Produits(){
		return (Set<Produit>) CR.findAll();
	}
	public Optional<Produit> FindProduit(Produit produit) {
		return CR.findById(produit.getIdProduit());
	}

}
