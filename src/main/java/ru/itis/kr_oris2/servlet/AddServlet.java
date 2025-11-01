package ru.itis.kr_oris2.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.itis.kr_oris2.entities.Train;
import ru.itis.kr_oris2.service.TrainService;

import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    private TrainService trainService = new TrainService();
    public  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/add.ftl").forward(req,resp);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Train train = new Train();

        train.setId_driver(Long.parseLong(req.getParameter("id_driver")));
        train.setName(req.getParameter("name"));
        train.setNumber_train(Long.parseLong(req.getParameter("number_train")));
        train.setNumber_road(Long.parseLong(req.getParameter("number_road")));

        trainService.addTrain(train);
        req.setAttribute("trains", trainService.getTrains());
        req.getRequestDispatcher("/table.ftl").forward(req,resp);
    }
}
