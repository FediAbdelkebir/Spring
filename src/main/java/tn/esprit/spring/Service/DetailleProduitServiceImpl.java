package tn.esprit.spring.Service;

import java.util.List;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.Repository.DetailleProduitRepository;
@Service
public class DetailleProduitServiceImpl {
	@Autowired
	DetailleProduitRepository CR;
	public Set<DetailProduit> DetailleProduits(){
		return (Set<DetailProduit>) CR.findAll();
	}
	public Optional<DetailProduit> FindDetailleProduits(Long id) {
		return CR.findById(id);
	}
	public void updateDetailleProduits(DetailProduit detailleproduit) {
		CR.save(detailleproduit);
	}
	public List<DetailProduit> getAllDetailleProduits() {
		// TODO Auto-generated method stub
		return (List<DetailProduit>) CR.findAll();
	}
	public DetailProduit AjouterDetailleProduits(DetailProduit detailleproduit) {
		// TODO Auto-generated method stub
		return CR.save(detailleproduit);
	}
	public void SuppimerDetailleProduit(Long idfacture) {
		CR.deleteById(idfacture);
		
	}
	public DetailleProduitServiceImpl() {
		// TODO Auto-generated constructor stub
	}

}
