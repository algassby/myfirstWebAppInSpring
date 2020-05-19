package com.projet.liste;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
 * @author algas
 *
 */
@Service
public class ListeAfaireService {

	private static List<ListeAfaire> liste =  new ArrayList<>();
	private static int totalListeId = 3;
	
	static {
		liste.add(new ListeAfaire(1, "Mes élèves","Apprendre J2E",new Date(), false));
		liste.add(new ListeAfaire(2, "Mes élèves","Continuer à regarder les videos",new Date(), false));
		liste.add(new ListeAfaire(3, "Mes élèves","Commenter le cours",new Date(), false));
	}
	/**
	 * 
	 * @param utilisateur
	 * @return
	 */
	public List<ListeAfaire> recupereListe(String utilisateur) {
		List<ListeAfaire> l  = new ArrayList<>();
		for (ListeAfaire listeAfaire : liste) {
			if(listeAfaire.getUtilisateur().equals(utilisateur)) {
				l.add(listeAfaire);
				
			}
			
		}
		return l;
		
	}
	/**
	 * 
	 * @param utilisateur
	 * @param description
	 * @param targetDate
	 * @param estEffectuee
	 */
	
	public void ajouter(String utilisateur, String description, Date targetDate, boolean estEffectuee) {
			liste.add(new ListeAfaire(++totalListeId, utilisateur,description, targetDate, estEffectuee));
	}
	/**
	 * 
	 * @param id
	 */
	public void supprimer(int id) {
		Iterator<ListeAfaire> it = liste.iterator();
		while (it.hasNext()) {
			ListeAfaire liste = it.next();
			if (liste.getId()== id) {
				it.remove();
				
			}
			
		}
		
		
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public ListeAfaire recupererTache(int id) {
		for (ListeAfaire listeAfaire : liste) {
			if(listeAfaire.getId() == id) {
				return listeAfaire;
			}
			
		}
		return null;
		
	}
	/**
	 * 
	 * @param listeAfaire
	 */
	public void mettreAjourTache( ListeAfaire listeAfaire) {
		liste.remove(listeAfaire);
		liste.add(listeAfaire);
	}

}
