package tn.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Long>{
	
}
