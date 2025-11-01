package ru.itis.kr_oris2.DAO;

import ru.itis.kr_oris2.db.DBConnection;
import ru.itis.kr_oris2.entities.Train;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainDAO {
    private Connection connection = DBConnection.getConnection();
    public void addTrain(Train train) throws SQLException {

        connection.setAutoCommit(false);


        PreparedStatement preparedStatement = connection.prepareStatement("insert into train (id_driver, name, number_train, number_road) values (?,?,?,?)");

        preparedStatement.setLong(1, train.getId_driver());
        preparedStatement.setString(2, train.getName());
        preparedStatement.setLong(3, train.getNumber_train());
        preparedStatement.setLong(4, train.getNumber_road());

        int result = preparedStatement.executeUpdate();
        preparedStatement.close();


    }
    public List<Train> getTrains() throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("select * from train");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Train> trains = new ArrayList<>();
        while (resultSet.next()) {
            Train train = new Train();
            train.setId(resultSet.getLong("id"));
            train.setId_driver(resultSet.getLong("id_driver"));
            train.setName(resultSet.getString("name"));
            train.setNumber_train(resultSet.getLong("number_train"));
            train.setNumber_road(resultSet.getLong("number_road"));
            trains.add(train);
        }
        resultSet.close();
        preparedStatement.close();
        return trains;
    }
    public void updateTrain(Train train) throws SQLException {


        PreparedStatement preparedStatement = connection.prepareStatement("update train set id_driver = ?, name = ?, number_train = ?, number_road = ? where id = ?");
        preparedStatement.setLong(1, train.getId_driver());
        preparedStatement.setString(2, train.getName());
        preparedStatement.setLong(3, train.getNumber_train());
        preparedStatement.setLong(4, train.getNumber_road());
        preparedStatement.setLong(5, train.getId());

        int result = preparedStatement.executeUpdate();
        preparedStatement.close();


    }
    public Optional<Train> getTrainsForId(Long id) throws SQLException {


        PreparedStatement preparedStatement = connection.prepareStatement("select * from train where id = ?");
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Train train = null;
        if (resultSet.next()) {
            train = new Train();
            train.setId(resultSet.getLong("id"));
            train.setId_driver(resultSet.getLong("id_driver"));
            train.setName(resultSet.getString("name"));
            train.setNumber_train(resultSet.getLong("number_train"));
            train.setNumber_road(resultSet.getLong("number_road"));

        }
        resultSet.close();
        preparedStatement.close();

        return Optional.ofNullable(train);
    }

}
