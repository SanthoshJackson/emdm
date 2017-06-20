package com.msa.ims.enterprisemdm.attributes.api;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msa.ims.enterprisemdm.attributes.entities.Class;
import com.msa.ims.enterprisemdm.attributes.services.ClassService;

/**
 * @author Santhosh 
 * Rest Controller for {@link Class}
 */
@RestController
@RequestMapping(value = "/class")
public class ClassController {

	@Inject
	public ClassService classService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * @param newClass
	 * @throws Exception
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addClass(@RequestBody Class newClass) throws Exception {
		logger.debug("Request received for adding a new class");
		classService.addClass(newClass);
	}
}
