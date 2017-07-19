package org.sid.service;

import org.sid.metier.OperationMerier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationRestService {

	@Autowired
	private OperationMerier operationMerier;

	@RequestMapping(value="/versement",method=RequestMethod.PUT)
	public boolean verser(@RequestParam String code,
			@RequestParam double montant, @RequestParam Long codeEmp) {
		return operationMerier.verser(code, montant, codeEmp);
	}

	@RequestMapping(value="/retrait",method=RequestMethod.PUT)
	public boolean retirer(@RequestParam String code,
			@RequestParam double montant, @RequestParam Long codeEmp) {
		return operationMerier.retirer(code, montant, codeEmp);
	}

	@RequestMapping(value="/virement",method=RequestMethod.PUT)
	public boolean virement(@RequestParam String cpte1,@RequestParam String cpte2,
			@RequestParam double montant,@RequestParam Long codeEmp) {
		return operationMerier.virement(cpte1, cpte2, montant, codeEmp);
	}
}
