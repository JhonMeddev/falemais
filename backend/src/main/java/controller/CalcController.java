package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.ResultadoDto;
import service.CalcService;

@RestController
@RequestMapping("/calculo")
public class CalcController {

	@Autowired
	private CalcService calcService;
	
	@GetMapping("/{origem}/{destino}/{plano}/{minutos}")
	ResultadoDto calc(
			@PathVariable long origem, 
			@PathVariable long destino,
			@PathVariable long plano,
			@PathVariable int minutos
			) {
		return calcService.calc(origem, destino, plano, minutos);
	}
}
