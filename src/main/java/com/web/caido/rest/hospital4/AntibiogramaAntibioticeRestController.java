package com.web.caido.rest.hospital4;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.web.caido.entity.hospital4.AntibiogramaAntibiotice;
import com.web.caido.service.hospital4.AntibiogramaAntibioticeService;
@RestController
@RequestMapping("/api")
public class AntibiogramaAntibioticeRestController {
	private final AntibiogramaAntibioticeService service;
	
	@Autowired
	public AntibiogramaAntibioticeRestController(AntibiogramaAntibioticeService theService) {
		service = theService;
	}
	
	@GetMapping("/antibiogramaantibiotices")
	public List<AntibiogramaAntibiotice> findAll() {
		return service.findAll();
	}

	
	@GetMapping("/antibiogramaantibiotice/{Id}")
	public AntibiogramaAntibiotice getAntibiogramaAntibiotice(@PathVariable int Id) {
		AntibiogramaAntibiotice object = service.findById(Id);
		if (object == null) {
			throw new RuntimeException("AntibiogramaAntibiotice id not found - " + Id);
		}
		return object;
	}
	
	@PostMapping("/antibiogramaantibiotices")
	public AntibiogramaAntibiotice addAntibiogramaAntibiotice(@RequestBody AntibiogramaAntibiotice object) {
		object.setId(0);
		service.save(object);
		return object;
	}
	
	@PutMapping("/antibiogramaantibiotices")
	public AntibiogramaAntibiotice updateAntibiogramaAntibiotice(@RequestBody AntibiogramaAntibiotice object) {
		service.save(object);
		return object;
	}
	
	@DeleteMapping("/antibiogramaantibiotice/{Id}")
	public String deleteAntibiogramaAntibiotice(@PathVariable int Id) {
		AntibiogramaAntibiotice object = service.findById(Id);
		if (object == null) {
			throw new RuntimeException("AntibiogramaAntibiotice id not found - " + Id);
		}
		service.deleteById(Id);
		return "Deleted AntibiogramaAntibiotice id - " + Id;
	}
}
