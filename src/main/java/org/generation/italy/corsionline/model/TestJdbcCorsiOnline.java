package org.generation.italy.corsionline.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.generation.italy.corsionline.model.dao.*;
import org.generation.italy.corsionline.model.entity.*;

public class TestJdbcCorsiOnline {

	Connection dbConnection;
	
	private UtenteDao utenteDao;
	private CorsoDao corsoDao;
	private EsameDao esameDao;
	private PrenotazioneEsameDao prenotazioneEsameDao;
	private PagamentoEsameDao pagamentoEsameDao;
	private DidatticaDao didatticaDao;
	
	






	public TestJdbcCorsiOnline() throws CorsiOnlineModelException {

		this.dbConnection = JdbcConnection.readJdbcConnectionInstance("mariadb", "org.mariadb.jdbc.Driver", "localhost",
				"3306", "corsi_online", "root", "").getDbConnection();

		
		this.utenteDao = new UtenteDao(this.dbConnection);
		this.corsoDao = new CorsoDao(this.dbConnection);
		this.esameDao = new EsameDao(this.dbConnection);
		this.prenotazioneEsameDao = new PrenotazioneEsameDao(this.dbConnection);
		this.pagamentoEsameDao = new PagamentoEsameDao(this.dbConnection);
		this.didatticaDao = new DidatticaDao(this.dbConnection);
		

	}
	

	public Connection getDbConnection() {
		return dbConnection;
	}


	public UtenteDao getUtenteDao() {
		return utenteDao;
	}

	public CorsoDao getCorsoDao() {
		return corsoDao;
	}

	public EsameDao getEsameDao() {
		return esameDao;
	}

	public PrenotazioneEsameDao getPrenotazioneEsameDao() {
		return prenotazioneEsameDao;
	}

	public PagamentoEsameDao getPagamentoEsameDao() {
		return pagamentoEsameDao;
	}

	public DidatticaDao getDidatticaDao() {
		return didatticaDao;
	}

	
	

	
}
