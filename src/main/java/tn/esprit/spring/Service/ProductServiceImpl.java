package tn.esprit.spring.Service;

import java.sql.Date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.Model.DetailProduit;
import tn.esprit.spring.Model.Produit;
import tn.esprit.spring.Repository.DetailleProduitRepository;
import tn.esprit.spring.Repository.ProductRepository;
@Service
@Slf4j
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
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return (List<Produit>) CR.findAll();
	}
	public Produit AjouterProduct(Produit s) {
		// TODO Auto-generated method stub
		return CR.save(s);
	}
	public void SuppimerProduct(Produit savedProduct) {
		// TODO Auto-generated method stub
		CR.delete(savedProduct);
		
	}

}
