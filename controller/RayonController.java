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
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.service.RayonService;

@RestController
@RequestMapping("Rayon")
@Api(tags = "Rayon Controller")
public class RayonController {
	@Autowired
	RayonService rayonService;
	
	@PostMapping("/add-rayon")
	@ResponseBody //trajaa retour
	Rayon addRayon(@RequestBody Rayon s) {
		return rayonService.addRayon(s);
	}
	  // http://localhost:8089/SpringMVC/Rayon/add-rayon//type json
	
	@GetMapping("/show")
	@ResponseBody //trajaa retour
	List<Rayon> retrieveAll(){
		return rayonService.retrieveAllRayons();
	}
	  // http://localhost:8089/SpringMVC/Rayon/show
	
	@PutMapping("/update-rayon")
	@ResponseBody
	Rayon updateRayon(@RequestBody Rayon s){
		return rayonService.updateRayon(s);
	}
	  // http://localhost:8089/SpringMVC/Rayon/update-rayon //type json avec id
	
	@DeleteMapping("/delete-rayon/{id}")
	void deleteRayon(@PathVariable(name="id") Long id){
		rayonService.deleteRayon(id);
	}
	  // http://localhost:8089/SpringMVC/Rayon/delete-rayon/6
	
	@GetMapping("/show/{id}")
	@ResponseBody
	Rayon retrieveById(@PathVariable Long id){
		return rayonService.retrieveRayon(id);
	}

}
