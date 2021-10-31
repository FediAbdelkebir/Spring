package tn.esprit.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tnesprit.Model.CategorieClient;
import tnesprit.Model.Profession;
import tnesprit.Model.Stock;
@Repository
public interface StockRepository extends CrudRepository<Stock,Long>{

	@Transactional
    @Modifying
    @Query(value="UPDATE stock SET qte= :qte,qteMin= :qteMin,libelleStock= :libelleStock WHERE idStock = :idStock ",nativeQuery = true)
    void update(@Param("idStock") long idStock,@Param("qte") int qte,@Param("qteMin") int qteMin,@Param("libelleStock") String libelleStock);
    
}
