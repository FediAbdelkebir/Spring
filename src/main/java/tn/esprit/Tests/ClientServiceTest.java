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
import tn.esprit.Service.ClientServiceImpl;
import tnesprit.Model.Client;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ClientServiceTest {
@Autowired
ClientServiceImpl clientService;

@Test

public void testAddClient() {
List<Client> clients = clientService.getAllClients();
for(Client Client : clients) {
	Log.info("Client : "+Client);
}
//
int expected=clients.size();
//
Client s = new Client();
s.setNom("Fedi");
s.setPrenom("Abdelkebir");
s.setPassword("Fedi123");
s.setDateNaissance("20/12/1998");
s.setEmail("abdelkebir.fedi@esprit.tn");
//
Client savedClient= clientService.AjouterClient(s);
//
assertEquals(expected+1, clientService.getAllClients().size());
//
assertNotNull(savedClient.getIdClient());
//
clientService.SuppimerClient(savedClient);
//
clientService.FindAllBetween();
}
}