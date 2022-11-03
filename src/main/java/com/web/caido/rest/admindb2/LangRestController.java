package com.web.caido.rest.admindb2;
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
import com.web.caido.entity.admindb2.Lang;
import com.web.caido.service.admindb2.LangService;
@RestController
@RequestMapping("/api")
public class LangRestController {
	private final LangService service;
	
	@Autowired
	public LangRestController(LangService theService) {
		service = theService;
	}
	
	@GetMapping("/langs")
	public List<Lang> findAll() {
		return service.findAll();
	}

	
	@GetMapping("/lang/{Id}")
	public Lang getLang(@PathVariable int Id) {
		Lang object = service.findById(Id);
		if (object == null) {
			throw new RuntimeException("Lang id not found - " + Id);
		}
		return object;
	}
	
	@PostMapping("/langs")
	public Lang addLang(@RequestBody Lang object) {
		object.setId(0);
		service.save(object);
		return object;
	}
	
	@PutMapping("/langs")
	public Lang updateLang(@RequestBody Lang object) {
		service.save(object);
		return object;
	}
	
	@DeleteMapping("/lang/{Id}")
	public String deleteLang(@PathVariable int Id) {
		Lang object = service.findById(Id);
		if (object == null) {
			throw new RuntimeException("Lang id not found - " + Id);
		}
		service.deleteById(Id);
		return "Deleted Lang id - " + Id;
	}
}
