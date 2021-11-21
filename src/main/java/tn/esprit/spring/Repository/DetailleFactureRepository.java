package tn.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.DetailFacture;
@Repository
public interface DetailleFactureRepository extends CrudRepository<DetailFacture,Long>{

}
