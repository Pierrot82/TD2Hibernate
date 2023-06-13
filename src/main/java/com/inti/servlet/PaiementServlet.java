package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.inti.beans.Paypal;
import com.inti.beans.Utilisateur;
import com.inti.beans.UtilisateurDetails;
import com.inti.util.bdd.UtilBDD;

/**
 * Servlet implementation class PaiementServlet
 */
@WebServlet("/paiement")
public class PaiementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaiementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/paiement.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
Session session = UtilBDD.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		double montant =  Double.parseDouble(request.getParameter("montant"));
		LocalDate date = LocalDate.parse(request.getParameter("date"));
		int numeroCompte= Integer.parseInt(request.getParameter("numeroCompte"));
		
		Paypal p1 = new Paypal(montant, date, numeroCompte);
		
		session.save(p1);
		
		session.getTransaction().commit();
		
	}

}
