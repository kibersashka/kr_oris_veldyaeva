package ru.itis.kr_oris2.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.itis.kr_oris2.entities.Train;
import ru.itis.kr_oris2.service.TrainService;

import java.io.IOException;

@WebServlet("/showone")
public class ShowOneServlet extends HttpServlet {
    private TrainService trainService = new TrainService();
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        req.setAttribute("train", trainService.getTrain(id));
        req.getRequestDispatcher("/showone.ftl").forward(req, resp);
    }

}
