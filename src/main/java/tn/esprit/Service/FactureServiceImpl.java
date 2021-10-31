package tn.esprit.Service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Repository.FactureRepository;
import tnesprit.Model.Facture;
@Service
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
}
