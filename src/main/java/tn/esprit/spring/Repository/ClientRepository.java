package tn.esprit.spring.Repository;
import java.util.List;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.Model.CategorieClient;
import tn.esprit.spring.Model.Client;
import tn.esprit.spring.Model.Profession;
@Repository
public interface ClientRepository extends CrudRepository<Client,Long>{

	 	@Transactional
	    @Modifying
	    @Query(value="UPDATE client SET nom= :nom,prenom= :prenom,dateNaissance= :dateNaissance,password= :password,categorieClient= :categorieClient,profession= :profession  WHERE idclient = :idclient ",nativeQuery = true)
	    void update(@Param("idclient") long idclient,@Param("dateNaissance") String dateNaissance,@Param("nom") String nom,@Param("prenom") String prenom,@Param("password") String password,@Param("categorieClient") CategorieClient categorieClient,@Param("profession") Profession profession);
	    
	 	 @Query(value="SELECT * FROM client WHERE dateNaissance BETWEEN '01/01/1995' AND '31/12/1995' ",nativeQuery = true)
	 	List<Client> findAllClientsBetween();
	     
}