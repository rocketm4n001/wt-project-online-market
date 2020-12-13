package controller.command.impl;

import controller.command.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DefaultPage implements Command 
{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
        PrintWriter pw=response.getWriter();
		
        String name=request.getParameter("name");

        pw.println("<html>");
        pw.println("<h1> Default </h1>");
        pw.println("</html>");
    }
}