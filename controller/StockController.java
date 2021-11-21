package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.StockService;

@RestController
@RequestMapping("Stock")
@Api(tags = "Stock Controller")
public class StockController {
	
	@Autowired
	StockService stockService;
	
	@PostMapping("/add-stock")
	@ResponseBody //trajaa retour
	Stock addStock(@RequestBody Stock s) {
		return stockService.addStock(s);
	}
	  // http://localhost:8089/SpringMVC/Stock/add-stock //type json
	
	@GetMapping("/show")
	@ResponseBody //trajaa retour
	List<Stock> retrieveAll(){
		return stockService.retrieveAllStocks();
	}
	  // http://localhost:8089/SpringMVC/Stock/show
	
	@PutMapping("/update-stock")
	@ResponseBody
	Stock updateStock(@RequestBody Stock s){
		return stockService.updateStock(s);
	}
	  // http://localhost:8089/SpringMVC/Stock/update-stock //type json avec id
	
	@DeleteMapping("/delete-stock/{id}")
	void deleteStock(@PathVariable(name="id") Long id){
		stockService.deleteStock(id);
	}
	  // http://localhost:8089/SpringMVC/Stock//delete-stock/6
	
	@GetMapping("/show/{id}")
	@ResponseBody
	Stock retrieveById(@PathVariable Long id){
		return stockService.retrieveStock(id);
	}
	
	
}
