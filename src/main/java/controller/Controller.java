package controller;

import controller.command.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Controller")
public class Controller extends HttpServlet 

    private final CommandProvider provider = new CommandProvider();
    private final String pathToJsp = "/WEB-INF/jsp/";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        String commandName = request.getServletPath();
        CommandProvider commandProvider = new CommandProvider();
        Command command = commandProvider.getCommand(commandName);

        try 
		{
			command.execute(request, response);
        } 
		catch (Exception ex) 
		{
            ex.getMessage();
        }
    }
}