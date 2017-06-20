package com.msa.ims.enterprisemdm.attributes.services;

import com.msa.ims.enterprisemdm.attributes.entities.Class;

/**
 * @author Santhosh
 *
 */
public interface ClassService {

	/**
	 * @param newClass
	 *            Persists a new {@link Class}.
	 */
	void addClass(Class newClass);
}
