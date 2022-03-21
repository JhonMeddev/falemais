package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import model.Taxa;
import repository.TaxaRepository;

@Service
public class TaxaService {

	@Autowired
	private TaxaRepository taxaRepository;
	
	public List<Taxa> findAll(){
		return taxaRepository.findAll(Sort.by(Sort.Order.asc("id")));
	}
	
	public void salvarOuAtualizar(Taxa taxa) {
		taxaRepository.saveAndFlush(taxa);
	}
	
	public void deletar(long id) {
		taxaRepository.deleteById(id);
	}
}
