package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.DDD;
import repository.DddRepository;

@Service
public class DddService {
	
	@Autowired
	private DddRepository dddRepository;
	
	public List<DDD> findAll(){
		return dddRepository.findAll();
	}
}
