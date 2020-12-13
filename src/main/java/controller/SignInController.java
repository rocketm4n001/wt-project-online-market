package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SignInController")
public class SignInController extends HttpServlet 
{
    private final String pathToJsp = "/WEB-INF/jsp/";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        String[] users = new String[]{"Ilya", "Andrey", "Valentin"};

        request.setAttribute("isWelcome", users);

        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
    }
}