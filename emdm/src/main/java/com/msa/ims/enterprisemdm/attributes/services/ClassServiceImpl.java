package com.msa.ims.enterprisemdm.attributes.services;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.msa.ims.enterprisemdm.attributes.dao.ClassRepository;
import com.msa.ims.enterprisemdm.attributes.entities.Class;

/**
 * @author Santhosh
 *
 */
@Service("classService")
@Transactional(readOnly = false, propagation = Propagation.SUPPORTS)
public class ClassServiceImpl implements ClassService {

	@Inject
	private ClassRepository classRepository;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.msa.ims.enterprisemdm.attributes.services.ClassService#addClass(com.
	 * msa.ims.enterprisemdm.attributes.entities.Class)
	 */
	@Transactional
	@Override
	public void addClass(Class newClass) {
		logger.debug(String.format("Saving class with following info %s", newClass.toString()));
		classRepository.save(newClass);
	}

}
