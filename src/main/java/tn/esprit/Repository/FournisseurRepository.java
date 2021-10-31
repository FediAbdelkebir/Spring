package tn.esprit.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tnesprit.Model.Fournisseur;
@Repository
public interface FournisseurRepository extends CrudRepository<Fournisseur,Long>{

}
