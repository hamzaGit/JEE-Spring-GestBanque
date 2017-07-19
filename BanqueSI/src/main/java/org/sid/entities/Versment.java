package org.sid.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Versment extends Operation{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
