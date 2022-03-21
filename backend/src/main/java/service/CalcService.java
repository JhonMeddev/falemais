package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Plano;
import model.ResultadoDto;
import model.Taxa;
import repository.PlanoRepository;
import repository.TaxaRepository;

@Service
public class CalcService {

	@Autowired
	private PlanoRepository planoRepository;
	
	@Autowired
	private TaxaRepository taxaRepository;
	
	public ResultadoDto calc(long origemId, long destinoId, long planoId, int minutos) {
		Taxa taxa = taxaRepository.findOneByOrigem_IdAndDestino_Id(origemId, destinoId);
		if (taxa == null) {
			return new ResultadoDto();
		}
		Plano plano = planoRepository.findById(planoId).get();
		double comPlano = comPlano(plano, taxa, minutos);
		double semPlano = semPlano(taxa, minutos);
		return new ResultadoDto(comPlano, semPlano);
	}
	
	private double comPlano(Plano plano, Taxa taxa, int minutos) {
		int minutosSemCobertura = minutos - plano.getMinutes();
		return minutosSemCobertura > 0 ? minutosSemCobertura * taxa.getValor() * 1.1 : 0;
	}
	
	private double semPlano (Taxa taxa, int minutos) {
		return taxa.getValor() * minutos;
	}
	
}
