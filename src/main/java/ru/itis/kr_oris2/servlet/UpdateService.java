package ru.itis.kr_oris2.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.itis.kr_oris2.service.TrainService;

import java.io.IOException;

@WebServlet("/update")
public class UpdateService extends HttpServlet {
    private TrainService trainService = new TrainService();

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        trainService.updateTrain(req);
        req.setAttribute("trains", trainService.getTrains());
        req.getRequestDispatcher("/table.ftl").forward(req, resp);
    }
}
