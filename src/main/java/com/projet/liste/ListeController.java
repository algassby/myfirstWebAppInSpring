/**
 * 
 */
package com.projet.liste;



import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeErrorException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;




/**
 * @author algas
 *
 */
@Controller
@SessionAttributes("prenom")
public class ListeController {
	@Autowired
	ListeAfaireService listeAfaireService;
/**
 * 
 * @return le nom d'utilisateur
 */
	private String prenom() {
		return "Mes élèves";
	}
	/**
	 * affiche la liste des taches
	 * @param model
	 * @return
	 */
	
	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public String  listeDesTaches(Model model) {
		
		model.addAttribute("liste", listeAfaireService.recupereListe(prenom()));
		
		return "liste";
		
	}
	/**
	 * affciche une tache par defaut lors de sa creation
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/ajout-liste", method = RequestMethod.GET)
	public String  afficherFormulaire(Model model) {
		
		model.addAttribute("liste", new ListeAfaire(0, "Mes élèves", "TEST", new Date(), false));
		
		return "ajout-liste";
		//throw new RuntimeException("error");
		
	}
	/**
	 * redirige l'application sur la page de bienvenue
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/bienvenue", method = RequestMethod.GET)
	public String  afficherPageAcceuil(Model model) {
		
		return "bienvenue";
		
	}
/**
 * Ajoute une tache dans la liste des taches
 * @param description
 * @param listeAfaire
 * @param result
 * @return
 */
	@RequestMapping(value = "/ajout-liste", method = RequestMethod.POST)
	public String  ajoutTaches(@RequestParam String description, @Valid @ModelAttribute("liste")ListeAfaire listeAfaire, BindingResult result) {
		if (result.hasErrors()) {
			return "ajout-liste";
		} 
		listeAfaireService.ajouter("Mes élèves", description, 	new Date(), false);
		
		return "redirect:liste";
		
	}
	/**
	 * supprime une tache en recuperant sont Id
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/supprimer-tache", method = RequestMethod.GET)
	public String  supprimer(@RequestParam int id) {
		
		listeAfaireService.supprimer(id);
		
		return "redirect:liste";
		
	}
	/**
	 * Affiche la tache à modifiée
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/modifier-tache", method = RequestMethod.GET)
	public String  afficherTache(@RequestParam int id, Model model) {
		
	ListeAfaire tache =	listeAfaireService.recupererTache(id);
	
		model.addAttribute("liste",tache);
		return "modifier-liste";
		
	}
	/**
	 * modifie la liste
	 * @param description
	 * @return
	 */
	@RequestMapping(value = "/modifier-liste", method = RequestMethod.POST)
	public String modifierTache( @Valid @ModelAttribute("liste") ListeAfaire listeAfaire,BindingResult result) {
		if(result.hasErrors()) {
			return "modifier-liste";
		}
		listeAfaire.setTargetDate(new Date());
		listeAfaire.setUtilisateur("Mes élèves");
		listeAfaireService.mettreAjourTache(listeAfaire);
		return "redirect:liste";
	}
	/**
	 * 
	 * @param binder, modifie la date avec le fomat souhaité
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat =  new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
		
		
	}

}


