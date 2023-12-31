package com.inti.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.inti.beans.Utilisateur;
import com.inti.beans.UtilisateurDetails;
import com.inti.util.bdd.UtilBDD;

/**
 * Servlet implementation class AfficherUtilisateurServlet
 */
@WebServlet("/afficherUtilisateur")
public class AfficherUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherUtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Session session = UtilBDD.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		List<Utilisateur> listeUtilisateur = session.createNativeQuery("select * from utilisateur",Utilisateur.class).list();
		request.setAttribute("listeUtilisateur", listeUtilisateur);
		
		List<UtilisateurDetails> listeUtilisateurDetails = session.createNativeQuery("select * from utilisateurdetails", UtilisateurDetails.class).list();
		request.setAttribute("listeUtilisateurDetails", listeUtilisateurDetails);
		
		
		
		session.getTransaction().commit();
		
		request.getRequestDispatcher("/WEB-INF/afficherUtilisateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
