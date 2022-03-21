package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_taxas")
public class Taxa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

    @JoinColumn(name = "origem", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private DDD origem;

    @JoinColumn(name="destino", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private DDD destino;

    @Column(nullable = false)
    private Double valor;


	
	public Taxa(long id, DDD origem, DDD destino, Double valor) {
		super();
		this.id = id;
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
	}



	public Taxa() { }



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public DDD getOrigem() {
		return origem;
	}



	public void setOrigem(DDD origem) {
		this.origem = origem;
	}



	public DDD getDestino() {
		return destino;
	}



	public void setDestino(DDD destino) {
		this.destino = destino;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}

	

	
}
