package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_planos")
public class Plano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
    @Column(nullable = false, unique = true)
    private int minutos;

	public Plano(long id, int minutos) {
		super();
		this.id = id;
		this.minutos = minutos;
	}
    
	public Plano() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMinutes() {
		return minutos;
	}

	public void setMinutes(int minutos) {
		this.minutos = minutos;
	}
	
	

}
