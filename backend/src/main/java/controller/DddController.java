package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.DDD;
import service.DddService;

@RestController
@RequestMapping("/ddds")
public class DddController {

	@Autowired
	private DddService dddService;
	
	@GetMapping("/no-link")
	List<DDD> findAll(){
		return dddService.findAll();
	}
}
