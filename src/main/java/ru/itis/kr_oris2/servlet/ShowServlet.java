package ru.itis.kr_oris2.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.itis.kr_oris2.service.TrainService;

import java.io.IOException;

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    private TrainService trainService = new TrainService();
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("trains", trainService.getTrains());
        req.getRequestDispatcher("/table.ftl").forward(req, resp);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/table.ftl").forward(req, resp);

    }
}
