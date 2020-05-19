/**
 * 
 */
package com.projet.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.projet.web.ValidPassword;


/**
 * @author algas
 *
 */
@Controller
@SessionAttributes("prenom")
public class MainController {
	@Autowired
	ValidPassword validPassword ;

	/**
	 * 
	 */
	public MainController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String pageAcceuil(Model model) {
		model.addAttribute("prenom", "Algassimou");
		return "bienvenue";
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String  postMethode(@RequestParam String prenom,@RequestParam String password, Model model) {
		if(!validPassword.estValide(prenom, password)) {
			model.addAttribute("error_login","votre identifiant ou votre mot de passe est invalide");
			return "acceuil";
			
		}
		model.addAttribute("prenom", prenom);
		model.addAttribute("password", password);
		return "bienvenue";
		
	}
	

}


