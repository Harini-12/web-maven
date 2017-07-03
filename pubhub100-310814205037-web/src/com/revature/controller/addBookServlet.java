package com.revature.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.bookdao.AddBook;
import com.revature.model.Book;

/**
 * Servlet implementation class addBookServlet
 */
@WebServlet("/addBookServlet")
public class addBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String priceDtr = request.getParameter("price");
		int price=Integer.parseInt(priceDtr);
		String author=request.getParameter("author");
		Book book=new Book();
		book.setName(name);
		book.setPrice(price);
		book.setAuthor(author);
		AddBook ab=new AddBook();
		try
		{
			ab.addBook(book);
			response.sendRedirect("home.jsp");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
