package org.generation.italy.corsionline.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


import org.generation.italy.corsionline.model.CorsiOnlineModelException;
import org.generation.italy.corsionline.model.dao.ADao;
import org.generation.italy.corsionline.model.entity.PrenotazioneEsame;

public class PrenotazioneEsameDao extends ADao {

	public PrenotazioneEsameDao(Connection jdbcConnectionToDatabase) {
		super(jdbcConnectionToDatabase);
		// TODO Auto-generated constructor stub
	}

	public void addPrenotazioneEsame(PrenotazioneEsame prenotazioneEsame) 
				throws CorsiOnlineModelException {
		 try {           
	            
	        	//TRIGGER TEMPORANEAMENTE DISATTIVATO: RIATTIVARE PER VERIFICA
//	        	Trigger.checkBeforeInsertMovimento(movimento);
	        	
	        
	        	
	        	//INSERISCE MOVIMENTO
	        	
	            PreparedStatement preparedStatement = this.jdbcConnectionToDatabase.prepareStatement(QueryCatalog.insertPrenotazioneEsame);
	            
	            preparedStatement.setInt(1, prenotazioneEsame.getIdEsame());
	            preparedStatement.setInt(2, prenotazioneEsame.getIdUtente());           
	            preparedStatement.setTimestamp(3,Timestamp.valueOf(prenotazioneEsame.getDataPrenotazione()));            
	            
	            preparedStatement.executeUpdate();
		 }
		 catch (SQLException sqlException) {

				throw new CorsiOnlineModelException("PrenotazioneEsameDao -> add Prenotazione Esame -> " + sqlException.getMessage());
		 }

		 }  
		} 