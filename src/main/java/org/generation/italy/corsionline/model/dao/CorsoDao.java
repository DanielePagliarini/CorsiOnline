package org.generation.italy.corsionline.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.generation.italy.corsionline.control.DataBaseManager;
import org.generation.italy.corsionline.model.entity.Corso;

public class CorsoDao extends ADao {

	public CorsoDao(Connection jdbcConnectionToDatabase) {
		super(jdbcConnectionToDatabase);
		// TODO Auto-generated constructor stub
	}

//    private static final String SELECT_ALL_QUERY = "SELECT * FROM corso";
//
//    public CorsoDao(Connection jdbcConnectionToDatabase) {
//        super(jdbcConnectionToDatabase);
//    }

//    public List<Corso> getAllCorsi() {
//        List<Corso> corsi = new ArrayList<>();
//        try (Connection connection = DataBaseManager.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                int idCorso = resultSet.getInt("id_corso");
//                String nome = resultSet.getString("nome");
//                String settore = resultSet.getString("settore");
//                int ore = resultSet.getInt("ore");
//                Corso corso = new Corso(idCorso, nome, settore, ore);
//                corsi.add(corso);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return corsi;
//    }
}
