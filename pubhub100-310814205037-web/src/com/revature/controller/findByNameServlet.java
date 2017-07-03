package com.revature.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.bookdao.FindByName;
import com.revature.model.Book;

/**
 * Servlet implementation class findByNameServlet
 */
@WebServlet("/findByNameServlet")
public class findByNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String name=request.getParameter("name");
		Book book=new Book();
		book.setName(name);
		
		FindByName fn=new FindByName();
	 try {
		 List<Book> b=fn.findbyname(book);
		 System.out.println(b.size());
		if(b.size()>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("search.jsp");
			request.setAttribute("books", b);
			rd.forward(request, response);
		}
		else
		{
		        response.sendRedirect("failure.jsp");
		}
		

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
