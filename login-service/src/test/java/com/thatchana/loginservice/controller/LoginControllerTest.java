package com.thatchana.loginservice.controller;

import org.testng.annotations.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.BeforeClass;

@WebMvcTest(controllers = LoginController.class)
public class LoginControllerTest {
	
  @Autowired
  private MockMvc mockMvc;
  
  @BeforeClass
  public void beforeClass() {
  }

  @Test
  public void aboutLoginServiceTest() throws Exception {
	  this.mockMvc.perform(get("/api/about").contentType("application/json")).andExpect(status().isOk());
	      
  }

  @Test
  public void authenticateTest() {
    throw new RuntimeException("Test not implemented");
  }
}
