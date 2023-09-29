package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Bookdao;
import entities.Book;

/**
 * Servlet implementation class Addbook
 */
@WebServlet("/Addbook")
public class Addbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addbook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Bookdao dao = new Bookdao();
		
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String availableOrNot = request.getParameter("availability");
		Boolean availability = Boolean.parseBoolean(availableOrNot);
		
		Book book = new Book(title,description,availability);
		try {
			dao.addBook(book);
			
			this.getServletContext().getRequestDispatcher("/Display").forward(request,response);
		} catch(Exception e) {
			this.getServletContext().getRequestDispatcher("/").forward(request,response);
		}
		
	}

}
