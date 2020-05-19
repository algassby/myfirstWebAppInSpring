package com.projet.web;

import org.springframework.stereotype.Service;

@Service
public class ValidPassword {

	public ValidPassword() {
		// TODO Auto-generated constructor stub
	}
	public boolean estValide(String prenom, String password) {
		if(prenom.equals("Algassimou") && (password.equals("admin"))) {
			return true;
		}
		else
			return false;
		
	}

}
