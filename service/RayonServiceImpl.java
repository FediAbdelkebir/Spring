package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.repository.RayonRepository;

@Service
@Slf4j
public class RayonServiceImpl implements RayonService{
	
	@Autowired
	RayonRepository rayonRepository;

	@Override
	public List<Rayon> retrieveAllRayons() {
		List<Rayon> rayons = (List<Rayon>) rayonRepository.findAll();
		for(Rayon rayon : rayons ){
			log.info("rayon : " + rayon);
		}
		return rayons;
	}

	@Override
	public Rayon addRayon(Rayon r) {
		return rayonRepository.save(r);
	}

	@Override
	public Rayon updateRayon(Rayon u) {
		Rayon rayon = rayonRepository.findById(u.getIdRayon()).orElse(null);
		rayon.setLibelleRayon(u.getLibelleRayon());
		rayon.setCodeRayon(u.getCodeRayon());
		return rayonRepository.save(rayon);
	}

	@Override
	public Rayon retrieveRayon(Long id) {
		return rayonRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteRayon(Long id) {
		rayonRepository.deleteById(id);
	}
	
	

}
