package com.revature.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.bookdao.RemoveBook;
import com.revature.model.Book;

/**
 * Servlet implementation class removeBookServlet
 */
@WebServlet("/removeBookServlet")
public class removeBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//Integer id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		//Integer price=Integer.parseInt(request.getParameter("price"));
		Book book=new Book();
		book.setName(name);
		/*book.setName(name);
		book.setPrice(price);*/
		RemoveBook rb=new RemoveBook();
		try
		{
			rb.removebook(book);
			response.sendRedirect("home.jsp");
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
