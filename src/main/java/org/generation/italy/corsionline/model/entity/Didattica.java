package org.generation.italy.corsionline.model.entity;

public class Didattica {
    private int idDidattica;
    private String username;
    private String password;
	public Didattica(int idDidattica, String username, String password) {
		super();
		this.idDidattica = idDidattica;
		this.username = username;
		this.password = password;
	}
	public int getIdDidattica() {
		return idDidattica;
	}
	public void setIdDidattica(int idDidattica) {
		this.idDidattica = idDidattica;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    // Costruttore, getter e setter
	
}
