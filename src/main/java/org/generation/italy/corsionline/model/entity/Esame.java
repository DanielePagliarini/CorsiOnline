package org.generation.italy.corsionline.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class Esame {
    private int idEsame;
    private int idCorso;
    private LocalDateTime dataEsame;
    private BigDecimal prezzo;
    private Byte crediti;
    private String luogo;
    private Short posti;
    
	public Esame(int idEsame, int idCorso, LocalDateTime dataEsame, BigDecimal prezzo, Byte crediti, String luogo,
			Short posti) {
		super();
		this.idEsame = idEsame;
		this.idCorso = idCorso;
		this.dataEsame = dataEsame;
		this.prezzo = prezzo;
		this.crediti = crediti;
		this.luogo = luogo;
		this.posti = posti;
	}

	public int getIdEsame() {
		return idEsame;
	}

	public void setIdEsame(int idEsame) {
		this.idEsame = idEsame;
	}

	public int getIdCorso() {
		return idCorso;
	}

	public void setIdCorso(int idCorso) {
		this.idCorso = idCorso;
	}

	public LocalDateTime getDataEsame() {
		return dataEsame;
	}

	public void setDataEsame(LocalDateTime dataEsame) {
		this.dataEsame = dataEsame;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public Byte getCrediti() {
		return crediti;
	}

	public void setCrediti(Byte crediti) {
		this.crediti = crediti;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public Short getPosti() {
		return posti;
	}

	public void setPosti(Short posti) {
		this.posti = posti;
	}
}
    
	