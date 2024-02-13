package org.generation.italy.corsionline.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class PagamentoEsame {
    private int idPagamento;
    private LocalDateTime dataPagamento;
    private BigDecimal importo;
    private int idUtente;
    private int idEsame;
    
	public PagamentoEsame(int idPagamento, LocalDateTime dataPagamento, BigDecimal importo, int idUtente, int idEsame) {
		super();
		this.idPagamento = idPagamento;
		this.dataPagamento = dataPagamento;
		this.importo = importo;
		this.idUtente = idUtente;
		this.idEsame = idEsame;
	}

	public int getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}

	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDateTime dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public int getIdEsame() {
		return idEsame;
	}

	public void setIdEsame(int idEsame) {
		this.idEsame = idEsame;
	}
    
}