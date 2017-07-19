package org.sid.metier;

import org.sid.entities.Compte;

public interface CompteMetier {
	public Compte saveCompte(Compte cp);
	public Compte getCompte(String code);

}
