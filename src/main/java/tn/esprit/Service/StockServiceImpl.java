package tn.esprit.Service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Repository.StockRepository;
import tnesprit.Model.Stock;
@Service
public class StockServiceImpl {

	@Autowired
	StockRepository CR;
	public void AjouterStock(Stock stock) {
		CR.save(stock);
	}
	public void UpdateStock(Stock stock) {
		CR.update(stock.getIdStock(),stock.getQte(),stock.getQteMin(),stock.getLibelleStock());
	}
	public void SuppimerStock(Stock stock) {
		CR.delete(stock);
		
	}
	public Set<Stock> Stocks(){
		return (Set<Stock>) CR.findAll();
	}
	public Optional<Stock> FindStock(Stock stock) {
		return CR.findById(stock.getIdStock());
	}


}
