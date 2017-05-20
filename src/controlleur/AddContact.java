package controlleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ContactDAO;

/**
 * Servlet implementation class AddContact
 */
public class AddContact extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String num_tel = request.getParameter("num_tel");
		String type_tel= request.getParameter("type_tel");
		String categorie= request.getParameter("categorie");


		try{
		
			 ContactDAO p = new ContactDAO();
	           p.addContact(nom,prenom,num_tel,type_tel,categorie);
	           response.sendRedirect("ListContact.jsp");
	           RequestDispatcher rd = getServletContext().getRequestDispatcher("/ListContact.jsp");
	   		rd.forward(request, response);
		}catch(Exception e)
		{
			System.out.println("e="+e.getMessage());
			}
		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
