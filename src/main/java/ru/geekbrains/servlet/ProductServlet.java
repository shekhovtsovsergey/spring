package ru.geekbrains.servlet;

import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@WebServlet(name = "ProductHttpServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", getProduct());
        getServletContext().getRequestDispatcher("/product.jsp").forward(req,resp);
    }



    private Product getProduct (){

        List<Product> products = Arrays.asList(

                new Product("1", "apple1", 1, null),
                new Product("2", "apple2", 2,null),
                new Product("3", "apple3", 3,null),
                new Product("4", "apple4", 4,null),
                new Product("5", "apple5", 5,null),
                new Product("6", "apple6", 6,null),
                new Product("7", "apple7", 7,null),
                new Product("8", "apple8", 8,null),
                new Product("9", "apple9", 9,null),
                new Product("10", "apple10", 10,null)

        );
        return new Product("11", "apple11", 11, products);
    }

}
