package tn.esprit.spring.Service;

import java.util.List;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.Model.Facture;
import tn.esprit.spring.Repository.FactureRepository;
@Service
@Slf4j
public class FactureServiceImpl {
	@Autowired
	FactureRepository CR;
	public Set<Facture> Factures(){
		return (Set<Facture>) CR.findAll();
	}
	public Optional<Facture> FindProduit(Long id) {
		return CR.findById(id);
	}
	public void updateFacture(Facture facture) {
		CR.update(facture.getIdFacture(), false);
	}
	public List<Facture> getAllFactures() {
		// TODO Auto-generated method stub
		return (List<Facture>) CR.findAll();
	}
	public Facture AjouterFacture(Facture s) {
		// TODO Auto-generated method stub
		return CR.save(s);
	}
	public void SuppimerFacture(Facture savedFacture) {
		CR.delete(savedFacture);
		
	}
}