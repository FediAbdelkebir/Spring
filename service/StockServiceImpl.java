package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.StockRepository;

@Service
@Slf4j
public class StockServiceImpl implements StockService{
	@Autowired
	StockRepository stockRepository;
	
	@Override
	public List<Stock> retrieveAllStocks() {
		List<Stock> stocks = (List<Stock>) stockRepository.findAll();
		for(Stock stock : stocks ){
			log.info("stock : " + stock);
		}
		return stocks;
		/*List<Stock> list = new ArrayList<>();
		stockRepository.findAll().forEach(e -> list.add(e));
		return list;*/
	}

	@Override
	public Stock addStock(Stock s) {
		log.info("Add Stock");
		return stockRepository.save(s);
	}

	@Override
	public Stock updateStock(Stock u) {
		Stock stock = stockRepository.findById(u.getIdStock()).orElse(null);
		stock.setLibelleStock(u.getLibelleStock());
		stock.setQteMin(u.getQteMin());
		stock.setQteStock(u.getQteStock());
		return stockRepository.save(stock);
	}

	@Override
	public Stock retrieveStock(Long id) {
		return stockRepository.findById(id).orElse(null);
		//return stockRepository.findById(id).get();
	}

	@Override
	public void deleteStock(Long id) {
		//Stock stock = stockRepository.findById(id).orElse(null);
		//stockRepository.deleteById(stock.getIdStock());
		stockRepository.deleteById(id);
		
	}

}
