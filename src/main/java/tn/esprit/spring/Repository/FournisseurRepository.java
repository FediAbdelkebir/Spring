package tn.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Model.Fournisseur;
@Repository
public interface FournisseurRepository extends CrudRepository<Fournisseur,Long>{

}
