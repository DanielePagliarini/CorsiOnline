package org.generation.italy.corsionline.model.entity;

import java.sql.Date;

public class PrenotazioneEsame {
    private int idEsame;
    private int idPrenotazione;
    private int idUtente;
    private Date dataPrenotazione;
    
    
	public PrenotazioneEsame(int idEsame, int idPrenotazione, int idUtente, Date dataPrenotazione) {
		super();
		this.idEsame = idEsame;
		this.idPrenotazione = idPrenotazione;
		this.idUtente = idUtente;
		this.dataPrenotazione = dataPrenotazione;
	}


	public int getIdEsame() {
		return idEsame;
	}


	public void setIdEsame(int idEsame) {
		this.idEsame = idEsame;
	}


	public int getIdPrenotazione() {
		return idPrenotazione;
	}


	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}


	public int getIdUtente() {
		return idUtente;
	}


	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}


	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}


	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
    
}
    
    
	