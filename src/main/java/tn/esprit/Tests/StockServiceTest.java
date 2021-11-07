package tn.esprit.Tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jdk.internal.jline.internal.Log;
import lombok.extern.slf4j.Slf4j;
import tn.esprit.Service.StockServiceImpl;
import tnesprit.Model.Client;
import tnesprit.Model.Stock;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StockServiceTest {
@Autowired
StockServiceImpl stockService;

@Test
public void testAddStock() {
List<Stock> stocks = stockService.getAllStocks();

for(Stock Stock : stocks) {
	Log.info("Stock : "+Stock);
}
//
int expected=stocks.size();
//
Stock s = new Stock();
s.setLibelleStock("stock test");
s.setQte(10);
s.setQteMin(100);
//
Stock savedStock= stockService.AjouterStock(s);
//
assertEquals(expected+1, stocks.size()+1);
//
assertNotNull(savedStock.getLibelleStock());
//
stockService.SuppimerStock(savedStock);
//
assertEquals(expected-1,stocks.size()-1);
//

}
}