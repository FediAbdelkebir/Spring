package tn.esprit.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tnesprit.Model.CategorieClient;
import tnesprit.Model.Produit;
import tnesprit.Model.Profession;
@Repository
public interface ProductRepository extends CrudRepository<Produit,Long>{

	 @Transactional
	 @Modifying
	 @Query(value="INSERT INTO produit(rayon,stock) VALUES(:rayon,:stock) ",nativeQuery = true)
	 public void InsertRayonStock(@Param("rayon") Long rayonId,@Param("stock") Long stockid);
	    
}
