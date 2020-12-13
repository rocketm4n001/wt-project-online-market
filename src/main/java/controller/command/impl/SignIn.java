package controller.command.impl;

import controller.command.Command;
import service.impl.ClientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignIn implements Command 
{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        ClientService clientService = new ClientService();

        String message = "";
		
        if (login != null && password != null) 
		{
            if (clientService.isRegistered(login, password)) 
			{
                message = "Регистрация прошла успешно!";
            } 
			else 
			{
                message = "Аккаунта не существует";
            }
        }

        request.setAttribute("message", message);
		
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

    }
}
