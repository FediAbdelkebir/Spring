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
import tn.esprit.Service.FactureServiceImpl;
import tnesprit.Model.Client;
import tnesprit.Model.Facture;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FactureServiceTest {
@Autowired
FactureServiceImpl factureService;

@Test
public void testAddFacture() {
List<Facture> factures = factureService.getAllFactures();
for(Facture Facture : factures) {
	Log.info("Facture : "+Facture);
}
//
int expected=factures.size();
//
Facture s = new Facture();
s.setMontantFacture(200);
s.setMontantRemise(50);
//
Facture savedFacture= factureService.AjouterFacture(s);
//
assertEquals(expected+1, factureService.getAllFactures().size());
//
assertNotNull(savedFacture.getMontantFacture());
//
factureService.SuppimerFacture(savedFacture);
}
}