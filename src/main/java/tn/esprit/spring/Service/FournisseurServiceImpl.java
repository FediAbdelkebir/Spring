package tn.esprit.spring.Service;

import java.util.List;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.Repository.FournisseurRepository;
@Service
@Slf4j
public class FournisseurServiceImpl {
	@Autowired
	FournisseurRepository CR;
	public Set<Fournisseur> Fournisseurs(){
		return (Set<Fournisseur>) CR.findAll();
	}
	public Optional<Fournisseur> FindFournisseur(Long id) {
		return CR.findById(id);
	}
	public void updateFournisseur(Fournisseur fournisseur) {
		CR.save(fournisseur);
	}
	public List<Fournisseur> getAllFournisseurs() {
		// TODO Auto-generated method stub
		return (List<Fournisseur>) CR.findAll();
	}
	public Fournisseur AjouterFournisseur(Fournisseur s) {
		// TODO Auto-generated method stub
		return CR.save(s);
	}
	public void SuppimerFournisseur(Long idfournisseur) {
		CR.deleteById(idfournisseur);
		
	}
	public FournisseurServiceImpl() {
		// TODO Auto-generated constructor stub
	}

}
