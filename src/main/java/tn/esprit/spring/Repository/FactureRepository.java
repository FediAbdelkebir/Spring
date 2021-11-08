package tn.esprit.spring.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.Model.Facture;
@Repository
public interface FactureRepository extends CrudRepository<Facture,Long>{
	@Transactional
    @Modifying
    @Query(value="UPDATE facture SET Active = :value WHERE idFacture = :idFacture ",nativeQuery = true)
    void update(@Param("idFacture") long idFacture,@Param("value") boolean value);
    
}
