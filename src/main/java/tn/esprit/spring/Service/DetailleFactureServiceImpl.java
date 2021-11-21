package tn.esprit.spring.Service;

import java.util.List;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.Repository.DetailleFactureRepository;
import tn.esprit.spring.Repository.FactureRepository;
@Service
public class DetailleFactureServiceImpl {
	@Autowired
	DetailleFactureRepository CR;
	public Set<DetailFacture> DetailleFactures(){
		return (Set<DetailFacture>) CR.findAll();
	}
	public Optional<DetailFacture> FindDetailleFactures(Long id) {
		return CR.findById(id);
	}
	public void updateDetailleFactures(DetailFacture detaillefacture) {
		CR.save(detaillefacture);
	}
	public List<DetailFacture> getAllDetailleFactures() {
		// TODO Auto-generated method stub
		return (List<DetailFacture>) CR.findAll();
	}
	public DetailFacture AjouterDetailleFactures(DetailFacture s) {
		// TODO Auto-generated method stub
		return CR.save(s);
	}
	public void SuppimerDetailleFacture(Long idfacture) {
		CR.deleteById(idfacture);
		
	}
	public DetailleFactureServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	

	

}
