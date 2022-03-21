package controller;

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

import model.Taxa;
import service.TaxaService;

@RestController
@RequestMapping("/taxas")
public class TaxaController {

	@Autowired
	private TaxaService taxaService;
	
	@GetMapping
	List<Taxa> findAll() {
		return this.taxaService.findAll();
	}
	
	@PostMapping
	void criar(@RequestBody Taxa taxa) {
		taxaService.salvarOuAtualizar(taxa);
	}
	
	@PutMapping
	void atualizar(@RequestBody Taxa taxa) {
		taxaService.salvarOuAtualizar(taxa);
	}
	
	@DeleteMapping("/{id}")
	void deletar(@PathVariable long id) {
		taxaService.deletar(id);
	}
}
