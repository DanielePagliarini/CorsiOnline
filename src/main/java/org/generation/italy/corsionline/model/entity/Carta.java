package org.generation.italy.corsionline.model.entity;

import java.math.BigDecimal;

public class Carta {
    private String nrCarta;
    private BigDecimal saldo;
    private int idUtente;
    
 // Costruttore
	public Carta(String nrCarta, BigDecimal saldo, int idUtente) {
		super();
		this.nrCarta = nrCarta;
		this.saldo = saldo;
		this.idUtente = idUtente;
	}
//    getter e setter

	public String getNrCarta() {
		return nrCarta;
	}

	public void setNrCarta(String nrCarta) {
		this.nrCarta = nrCarta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}
	
	
}
