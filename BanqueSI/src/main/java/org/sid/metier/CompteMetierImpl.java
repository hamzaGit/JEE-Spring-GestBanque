package org.sid.metier;

import java.util.Date;

import org.sid.dao.CompteRepository;
import org.sid.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CompteMetierImpl implements CompteMetier {

	@Autowired
	private CompteRepository compteRepository;
	@Override
	public Compte saveCompte(Compte cp) {
		cp.setDateCreation(new Date());
		return compteRepository.save(cp);
	}

	@Override
	public Compte getCompte(String code) {
		// TODO Auto-generated method stub
		return compteRepository.findOne(code);
	}

}
