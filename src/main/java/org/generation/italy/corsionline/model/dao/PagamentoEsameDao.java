package org.generation.italy.corsionline.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.generation.italy.corsionline.model.CorsiOnlineModelException;
import org.generation.italy.corsionline.model.dao.ADao;
import org.generation.italy.corsionline.model.entity.PagamentoEsame;
import org.generation.italy.corsionline.model.entity.PrenotazioneEsame;
public class PagamentoEsameDao extends ADao {

	public PagamentoEsameDao(Connection jdbcConnectionToDatabase) {
		super(jdbcConnectionToDatabase);
		// TODO Auto-generated constructor stub
	}
	public void addPagamentoEsame(PagamentoEsame pagamentoEsame) throws CorsiOnlineModelException {
	    try {
	        PreparedStatement preparedStatement = this.jdbcConnectionToDatabase.prepareStatement(QueryCatalog.insertPagamentoEsame);
	        
	        preparedStatement.setInt(1, pagamentoEsame.getIdEsame());
	        preparedStatement.setInt(2, pagamentoEsame.getIdUtente());   
	        preparedStatement.setInt(3, pagamentoEsame.getIdPrenotazione());
	        preparedStatement.setBigDecimal(4, pagamentoEsame.getImporto());
	        preparedStatement.setString(5, pagamentoEsame.getNrCarta()); // Assicurati di avere un metodo getImporto() nella classe PagamentoEsame
	        preparedStatement.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now())); // Utilizza la data e l'ora attuali
	        

	        // Esegui l'operazione di inserimento nel database
	        preparedStatement.executeUpdate();
	       
	        // Conferma la transazione
	        this.jdbcConnectionToDatabase.commit();
	    } catch (SQLException sqlException) {
	        // Gestione dell'eccezione
	        throw new CorsiOnlineModelException("PagamentoEsameDao -> add Pagamento Esame -> " + sqlException.getMessage());
	    }
	}
}
