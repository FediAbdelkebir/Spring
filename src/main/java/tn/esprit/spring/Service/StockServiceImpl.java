package tn.esprit.spring.Service;

import java.util.List;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.Model.Stock;
import tn.esprit.spring.Repository.StockRepository;
@Service
@Slf4j
public class StockServiceImpl {

	@Autowired
	StockRepository CR;
	public Stock AjouterStock(Stock stock) {
		return CR.save(stock);
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
	public List<Stock> getAllStocks() {
		
		return (List<Stock>) CR.findAll();
	}


}
