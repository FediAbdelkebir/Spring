package tn.esprit.spring.Service;

import java.util.List;

import tn.esprit.spring.entity.Rayon;

public interface RayonService {
	List<Rayon> retrieveAllRayons();
	Rayon addRayon(Rayon r);
	Rayon updateRayon(Rayon r);
	Rayon retrieveRayon(Long id);
	void deleteRayon(Long id);
}
