package controller.command.impl;

        import beans.Product;
        import controller.command.Command;

        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;

public class ProductInfo implements Command 
{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
        Product pr;
        pr = new Product(1, "Wenger", 4998, "blue", "/images/blue.jpg", "40", "Wenger Rich Clocks");

        boolean isAlreadyInCart=false;
        boolean isSuccess =false;
		
        String[] navigation = new String[]{"Diezel", "Wenger", "Seiko", "Ball", "Corum"};

        request.setAttribute("isAlreadyInCart", isAlreadyInCart);
        request.setAttribute("isSuccess", isSuccess);
        request.setAttribute("navigation", Navigation);
        request.setAttribute("product", pr);
		
        request.getRequestDispatcher("/WEB-INF/jsp/about.jsp").forward(request, response);

    }
}