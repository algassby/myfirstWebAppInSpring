package com.projet.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/acceuil")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ValidPassword validPassword = new ValidPassword();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("prenom", request.getParameter("prenom"));
		request.getRequestDispatcher("WEB-INF/views/acceuil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * String prenom = request.getParameter("prenom"); String password =
	 * request.getParameter("password");
	 * 
	 * boolean valid = validPassword.estValide(prenom, password);
	 * 
	 * if(valid) { request.setAttribute("prenom", prenom);
	 * request.setAttribute("password", password);
	 * request.getServletContext().getRequestDispatcher(
	 * "/WEB-INF/views/bienvenue.jsp").forward(request, response); } else {
	 * request.setAttribute("error_login",
	 * "votre identifiant ou votre mot de passe est invalide");
	 * request.getServletContext().getRequestDispatcher("/WEB-INF/views/acceuil.jsp"
	 * ).forward(request, response); }
	 * 
	 * 
	 * }
	 */

}
