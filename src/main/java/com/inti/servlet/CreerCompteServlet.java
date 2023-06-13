package com.inti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Param;
import org.hibernate.Session;

import com.inti.beans.Utilisateur;
import com.inti.beans.UtilisateurDetails;
import com.inti.util.bdd.UtilBDD;

/**
 * Servlet qui va être appelé par l'url se terminant par creerCompte
 * Objectif: rediriger la requete http vers une page jsp contenant un formulaire pour saisir les propriétés d'un utilisateur avec les détails
 * de plus le rôle minimum client sera affecté par défault à tout les nouveaux utilisateurs
 * @author shiki
 *
 */

@WebServlet("/creerCompte")
public class CreerCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CreerCompteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		request.getRequestDispatcher("/WEB-INF/creerCompte.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session = UtilBDD.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		
		Utilisateur u = new Utilisateur(login, mdp);
		
		String adresse = request.getParameter("adresse");
		String ville = request.getParameter("ville");
		int cp = Integer.parseInt(request.getParameter("cp"));
		long telephone = Long.parseLong(request.getParameter("telephone"));
		String email = request.getParameter("email");
		
		UtilisateurDetails ud = new UtilisateurDetails(adresse, ville, cp, telephone, email);
		
		session.save(ud);
		u.setUtilisateurDetails(ud);
		session.save(u);
		
		session.getTransaction().commit();
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
