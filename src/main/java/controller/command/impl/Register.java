package controller.command.impl;

import controller.command.Command;
import service.impl.ClientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Register implements Command 
{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String passwordRepeat = request.getParameter("password_repeat");
        String email = request.getParameter("email");

        ClientService clientService = new ClientService();

        String message = "";
		
        if (login != null && password != null && passwordRepeat != null) 
		{
            if (!clientService.isPasswordsEqual(password, passwordRepeat)) 
			{
                message = "Пароли не совпадают";
            } 
			else 
			{
                if (clientService.isRegistered(login, password)) 
				{
                    message = "Аккаунт уже существует в системе!";
                } 
				else 
				{
                    message = "Регистрация доступна!";
                }
            }
        }
        request.setAttribute("message", message);

        request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp").forward(request, response);
    }
}

