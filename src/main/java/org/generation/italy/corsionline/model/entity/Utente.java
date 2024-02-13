package org.generation.italy.corsionline.model.entity;

public class Utente {
    private int idUtente;
    private String username;
    private String password;
    private String nominativo;
    private String codFiscale;
    private String email;
    private String nrTelefono;
    private String nrDocumento;
    
 // Costruttore
    
	public Utente(int idUtente, String username, String password, String nominativo, String codFiscale, String email,
			String nrTelefono, String nrDocumento) {
		super();
		this.idUtente = idUtente;
		this.username = username;
		this.password = password;
		this.nominativo = nominativo;
		this.codFiscale = codFiscale;
		this.email = email;
		this.nrTelefono = nrTelefono;
		this.nrDocumento = nrDocumento;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
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

	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	public String getCodFiscale() {
		return codFiscale;
	}

	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNrTelefono() {
		return nrTelefono;
	}

	public void setNrTelefono(String nrTelefono) {
		this.nrTelefono = nrTelefono;
	}

	public String getNrDocumento() {
		return nrDocumento;
	}

	public void setNrDocumento(String nrDocumento) {
		this.nrDocumento = nrDocumento;
	}

   // getters e setters
	

}

