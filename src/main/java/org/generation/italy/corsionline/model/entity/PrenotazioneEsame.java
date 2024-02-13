package org.generation.italy.corsionline.model.entity;

import java.sql.Date;
import java.time.LocalDateTime;

public class PrenotazioneEsame {
    private int idEsame;
    private int idPrenotazione;
    private int idUtente;
    private LocalDateTime dataPrenotazione;
    
    
	


	public PrenotazioneEsame(int idEsame, int idUtente, LocalDateTime dataPrenotazione) {
		super();
		this.idEsame = idEsame;
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





	public LocalDateTime getDataPrenotazione() {
		return dataPrenotazione;
	}





	public void setDataPrenotazione(LocalDateTime dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

}
	
    
    
	