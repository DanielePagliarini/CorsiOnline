package org.generation.italy.corsionline.model.entity;

public class Corso {
    private int idCorso;
    private String nome;
    private String settore;
    private int ore;
    
 // Costruttore
    
	public Corso(int idCorso, String nome, String settore, int ore) {
		super();
		this.idCorso = idCorso;
		this.nome = nome;
		this.settore = settore;
		this.ore = ore;
	}

	public int getIdCorso() {
		return idCorso;
	}

	public void setIdCorso(int idCorso) {
		this.idCorso = idCorso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSettore() {
		return settore;
	}

	public void setSettore(String settore) {
		this.settore = settore;
	}

	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		this.ore = ore;
	}

    // getter e setter
	 
}
