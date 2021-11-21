package tn.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long>{

}
