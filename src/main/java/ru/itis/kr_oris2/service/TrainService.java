package ru.itis.kr_oris2.service;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.itis.kr_oris2.DAO.TrainDAO;
import ru.itis.kr_oris2.entities.Train;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class TrainService {
    private TrainDAO trainDAO =  new TrainDAO();
    public void addTrain(Train train){
        try {
            trainDAO.addTrain(train);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Train> getTrains(){
        try {
            return trainDAO.getTrains();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Train getTrain(Long id){
        try {
             return trainDAO.getTrainsForId(id).get();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateTrain(HttpServletRequest req){
        Train train = new Train();

        Long id = Long.parseLong(req.getParameter("id"));
        train.setId(id);
        String name = req.getParameter("name");
        train.setName(name);
        Long id_driver = Long.parseLong(req.getParameter("id_driver"));
        train.setId_driver(id_driver);
        Long number_train = Long.parseLong(req.getParameter("number_train"));
        train.setNumber_train(number_train);
        Long number_road = Long.parseLong(req.getParameter("number_road"));
        train.setNumber_road(number_road);

        try {
            trainDAO.updateTrain(train);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
