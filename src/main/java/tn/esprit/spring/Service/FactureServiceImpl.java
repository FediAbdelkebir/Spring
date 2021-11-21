package tn.esprit.spring.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.Repository.FactureRepository;

@Slf4j
@Service
public class FactureServiceImpl implements FactureService{
	@Autowired
	FactureRepository factureRepository;

	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> factures = (List<Facture>) factureRepository.findAll();
		for(Facture facture : factures ){
			log.info("facture : " + facture);
		}
		return factures;
	}

	@Override
	public void cancelFacture(Long id) {
		
	}

	@Override
	public Facture retrieveFacture(Long id) {
		return factureRepository.findById(id).orElse(null);
	}

	public void AjouterFacture(Facture facture) {
		factureRepository.save(facture);
		
	}

	public void SuppimerFacture(Long idfacture) {
		factureRepository.deleteById(idfacture);
		
	}

}
