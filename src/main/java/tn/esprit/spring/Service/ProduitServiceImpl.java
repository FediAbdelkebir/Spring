package tn.esprit.spring.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.Repository.FournisseurRepository;
import tn.esprit.spring.Repository.ProduitRepository;
import tn.esprit.spring.Repository.RayonRepository;
import tn.esprit.spring.Repository.StockRepository;

//@Slf4j
@Service
public class ProduitServiceImpl implements ProduitService{
	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	RayonRepository rayonRepo;
	@Autowired
	StockRepository stockRepo;
	@Autowired
	FournisseurRepository fournisseurRepo;

	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits = (List<Produit>) produitRepository.findAll();
		/*for(Produit produit : produits ){
			log.info("produit : " + produit);
		}*/
		return produits;
		
	}
	
	@Override
	public Produit retrieveProduit(Long id) {
		return produitRepository.findById(id).orElse(null);
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		Rayon rayon = rayonRepo.findById(idRayon).orElse(null);
		Stock stock = stockRepo.findById(idStock).get();
		p.setStock(stock);
		p.setRayon(rayon);
		p.setLibelleProduit(p.getLibelleProduit());
		p.setPrixUnitaire(p.getPrixUnitaire());
		p.setCodeProduit(p.getCodeProduit());
		return produitRepository.save(p);
	}

	@Override
	public void assignProduitToStock(Long idProduit, Long idStock) {
		Produit p = produitRepository.findById(idProduit).orElse(null);
		Stock s = stockRepo.findById(idStock).orElse(null);
		p.setStock(s);
		produitRepository.save(p);
	}

	@Override
	public void assignFournisseurToProduit(Long idFournisseur, Long idProduit) {
		Fournisseur f = fournisseurRepo.findById(idFournisseur).orElse(null);
		Produit p = produitRepository.findById(idProduit).orElse(null);
		p.enrollFournisseur(f);
		produitRepository.save(p);
	}

}
