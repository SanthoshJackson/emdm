package com.msa.ims.enterprisemdm.attributes;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msa.ims.enterprisemdm.attributes.api.ClassController;
import com.msa.ims.enterprisemdm.attributes.entities.Class;
import com.msa.ims.enterprisemdm.attributes.services.ClassService;

/**
 * @author Santhosh
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ClassController.class)
public class ClassControllerTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ClassService service;

	@Autowired
	private ObjectMapper objectMapper;

	/**
	 * @throws Exception
	 */
	@Test
	public void controllerCallTest() throws Exception {

		logger.debug("Testing attribute Controller method for adding Class");
		Class newClass = new Class(0L, "Cars", "AutoMobiles", "Four Wheeler", new Date(), new Date(), new Date(),
				"Controller_Test");
		this.mockMvc.perform(post("/class/add").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(newClass))).andExpect(status().isOk());

	}
}
