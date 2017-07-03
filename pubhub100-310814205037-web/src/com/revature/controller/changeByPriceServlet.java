package com.revature.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.bookdao.UpdateBookPrice;
import com.revature.model.Book;

/**
 * Servlet implementation class changeByPriceServlet
 */
@WebServlet("/changeByPriceServlet")
public class changeByPriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changeByPriceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		/*Integer id=Integer.parseInt(request.getParameter("id"));
		Integer price=Integer.parseInt(request.getParameter("price"));*/
		String name=request.getParameter("name");
		Book book=new Book();
		
		book.setName(name);
		UpdateBookPrice ub=new UpdateBookPrice();
		try 
		{
			ub.updatebookprice(book);
			response.sendRedirect("home.jsp");
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
		
	}

}
