/**
 * 
 */
package com.projet.liste;

import java.util.Date;

import javax.validation.constraints.Size;

/**
 * @author algas
 *
 */
public class ListeAfaire {
	private int id;
	private String utilisateur;
	@Size(min=5, message = "veuillez entrer au minimum 5 caractères")
	private String description;
	private Date targetDate;
	private boolean estEffectuee;
	
	/**
	 * 
	 * @param id
	 * @param utilisateur
	 * @param description
	 * @param targetDate
	 * @param estEffectuee
	 */
	public ListeAfaire(int id, String utilisateur, String description, Date targetDate, boolean estEffectuee) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.description = description;
		this.targetDate = targetDate;
		this.estEffectuee = estEffectuee;
	}

	/**
	 * 
	 */
	public ListeAfaire() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the utilisateur
	 */
	public String getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the targetDate
	 */
	public Date getTargetDate() {
		return targetDate;
	}

	/**
	 * @param targetDate the targetDate to set
	 */
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	/**
	 * @return the estEffectuee
	 */
	public boolean isEstEffectuee() {
		return estEffectuee;
	}

	/**
	 * @param estEffectuee the estEffectuee to set
	 */
	public void setEstEffectuee(boolean estEffectuee) {
		this.estEffectuee = estEffectuee;
	}

	@Override
	public String toString() {
		return "ListeAfaire [id=" + id + ", utilisateur=" + utilisateur + ", description=" + description
				+ ", targetDate=" + targetDate + ", estEffectuee=" + estEffectuee + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListeAfaire other = (ListeAfaire) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
