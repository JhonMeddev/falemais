package model;

public class ResultadoDto {

	private double comPlano;
	private double semPlano;
	
	
	public ResultadoDto(double comPlano, double semPlano) {
		
		this.comPlano = comPlano;
		this.semPlano = semPlano;
	}
	
	public ResultadoDto() { }

	public double getComPlano() {
		return comPlano;
	}

	public void setComPlano(double comPlano) {
		this.comPlano = comPlano;
	}

	public double getSemPlano() {
		return semPlano;
	}

	public void setSemPlano(double semPlano) {
		this.semPlano = semPlano;
	}
	
	
}
