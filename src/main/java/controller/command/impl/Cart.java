package controller.command.impl;

import beans.Product;
import controller.command.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Cart implements Command 
{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
        Product pr = new Product(1, "Wenger", 9998, "blue", "/images/blue.jpg", "36", "Wenger Rich Clocks");
		
        Product[] products = new Product[4];

        for (int i = 0; i < 2; i++)
        {
            products[i] = pr;
        }

        boolean isEmpty = false;
		
        request.setAttribute("Products", products);

        request.setAttribute("total_price", 9998);
        request.setAttribute("total_amount", 2);
        request.setAttribute("isEmpty", isEmpty);

        request.getRequestDispatcher("/WEB-INF/jsp/cart.jsp").forward(request, response);
    }
}