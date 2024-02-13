package org.generation.italy.corsionline.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.generation.italy.corsionline.model.dao.*;
import org.generation.italy.corsionline.model.entity.*;

public class TestJdbcCorsiOnline {

	Connection dbConnection;
	private CartaDao cartaDao;
	private UtenteDao utenteDao;
	private CorsoDao corsoDao;
	private EsameDao esameDao;
	private PrenotazioneEsameDao prenotazioneEsameDao;
	private PagamentoEsameDao pagamentoEsameDao;
	private DidatticaDao didatticaDao;
	
	






	public TestJdbcCorsiOnline() throws CorsiOnlineModelException {

		this.dbConnection = JdbcConnection.readJdbcConnectionInstance("mariadb", "org.mariadb.jdbc.Driver", "localhost",
				"3306", "corsi_online", "root", "").getDbConnection();

		this.cartaDao = new CartaDao(this.dbConnection);
		this.utenteDao = new UtenteDao(this.dbConnection);
		this.corsoDao = new CorsoDao(this.dbConnection);
		this.esameDao = new EsameDao(this.dbConnection);
		this.prenotazioneEsameDao = new PrenotazioneEsameDao(this.dbConnection);
		this.pagamentoEsameDao = new PagamentoEsameDao(this.dbConnection);
		this.didatticaDao = new DidatticaDao(this.dbConnection);
		

	}
	
	/**
	 * Viene inizializzato il database rimuovendo eventuali dati presenti nelle
	 * tabelle
	 * 
	 * Le query qui presenti sono potenzialmente dannose ed � per questo che non
	 * sono presenti nel query catalog (classe QueryCatalog).
	 * 
	 * Sono qui presenti solo ed esclusivametne ai fini della predisposizone del
	 * test di funzionamento del componente model che approfondiremo nelle prossime
	 * lezioni
	 * 
	 * I comandi SQL-DELETE sono svolti a partire dalla tabella movimento. Infatti,
	 * questa � tabella correlata (join) con la tabella conto sul campo iban. A
	 * seguire, anche conto � tabella correlata con cliente sul campo
	 * codice_fiscale, per cui si elimineranno prima i record della tabella conto e
	 * successivamente quelli di cliente.
	 * 
	 */

//	private void clearDatabase() throws CorsiOnlineModelException {
//
//		try {
//
//			// DELETE FROM carta
//			PreparedStatement preparedStatement1 = this.dbConnection.prepareStatement(" DELETE FROM carta ");
//			preparedStatement1.executeUpdate();
//
//			// DELETE FROM corso
//			PreparedStatement preparedStatement2 = this.dbConnection.prepareStatement(" DELETE FROM corso ");
//			preparedStatement2.executeUpdate();
//
//			// DELETE FROM didattica
//			PreparedStatement preparedStatement3 = this.dbConnection.prepareStatement(" DELETE FROM didattica ");
//			preparedStatement3.executeUpdate();
//			
//			// DELETE FROM esame
//			PreparedStatement preparedStatement4 = this.dbConnection.prepareStatement(" DELETE FROM esame ");
//			preparedStatement3.executeUpdate();
//			
//			// DELETE FROM pagamentoesame
//			PreparedStatement preparedStatement5 = this.dbConnection.prepareStatement(" DELETE FROM pagamentoEsame ");
//			preparedStatement3.executeUpdate();
//			
//			// DELETE FROM prenotazioneesame
//			PreparedStatement preparedStatement6 = this.dbConnection.prepareStatement(" DELETE FROM prenotazioneEsame ");
//			preparedStatement3.executeUpdate();
//			
//			// DELETE FROM utente
//			PreparedStatement preparedStatement7 = this.dbConnection.prepareStatement(" DELETE FROM utente ");
//			preparedStatement3.executeUpdate();
//			
//
//		} catch (SQLException sqlException) {
//			throw new CorsiOnlineModelException("TestJdbcBanca -> clearDatabase -> " + sqlException.getMessage());
//		}
//
//		// DELETE FROM conto
//		// DELETE FROM cliente
//	}

	public Connection getDbConnection() {
		return dbConnection;
	}

	public CartaDao getCartaDao() {
		return cartaDao;
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
