package controller.command.impl;

import beans.Product;
import controller.command.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OpenMain implements Command 
{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        Product pr = new Product(1, "Wenger", 4998, "blue", "/images/blue.jpg", "40", "Wenger Rich Clocks");
		
        Product[] products = new Product[10];

        for (int i = 0; i < 10; i++)
        {
            products[i] = pr;
        }
		
        String[] navigation = new String[]{"Diezel", "Wenger", "Seiko", "Ball", "Corum"};

        boolean isNothing = false;

        request.setAttribute("Products", products);
        request.setAttribute("navigation", navigation);
        request.setAttribute("isNothing", isNothing);

        request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
    }
}
