package com.msa.ims.enterprisemdm.attributes;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msa.ims.enterprisemdm.attributes.entities.Class;
import com.msa.ims.enterprisemdm.attributes.services.AttributeServiceImpl;
import com.msa.ims.enterprisemdm.attributes.services.ClassService;
import com.msa.ims.enterprisemdm.attributes.services.ClassServiceImpl;

/**
 * @author AL1885
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AddClassTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Inject
	private ClassService classService;

	/**
	 * 
	 */
	@Test
	public void serviceTest() {
		logger.debug("Testing attribute service for adding Class");
		Class newClass = new Class(0L, "Cars", "AutoMobiles", "Four Wheeler", new Date(), new Date(), new Date(),
				"Service_Test");
		classService.addClass(newClass);
	}

}
