package tn.esprit.spring.Service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;
import jdk.internal.jline.internal.Log;
import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.Model.Stock;
import tn.esprit.spring.Service.StockServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StockServiceTest {
	@Autowired
	StockServiceImpl stockService;

	@Test
	public void testAddStock() {
		List<Stock> stocks = stockService.getAllStocks();
		/*
		 * for(Stock Stock : stocks) { Log.info("Stock : "+Stock); }
		 */
//
		int expected = stocks.size();
//
		Stock s = new Stock();
		s.setLibelleStock("stock test");
		s.setQte(10);
		s.setQteMin(100);
//
		Stock savedStock = stockService.AjouterStock(s);
//
		assertEquals(expected + 1, stocks.size() + 1);
//
		assertNotNull(savedStock.getLibelleStock());
//

//stockService.SuppimerStock(savedStock);
//
//assertEquals(expected-1,stocks.size()-1);
//

	}
}