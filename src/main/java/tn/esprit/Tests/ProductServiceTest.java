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
import tn.esprit.Service.ProductServiceImpl;
import tnesprit.Model.Client;
import tnesprit.Model.Produit;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductServiceTest {
@Autowired
ProductServiceImpl productService;

@Test
public void testAddProduct() {
List<Produit> products = productService.getAllProduits();
for(Produit Produit : products) {
	Log.info("Produit : "+Produit);
}
//
int expected=products.size();
//
Produit s = new Produit();
s.setCode("CODE007");
s.setLibelle("Hrisa");
s.setPrixUnitaire("1700");
//
Produit savedProduct= productService.AjouterProduct(s);
//
assertEquals(expected+1, productService.getAllProduits().size());
//
assertNotNull(savedProduct.getLibelle());
//
productService.SuppimerProduct(savedProduct);
}
}