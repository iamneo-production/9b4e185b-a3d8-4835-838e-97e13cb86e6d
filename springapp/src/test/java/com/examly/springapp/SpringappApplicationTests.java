package com.examly.springapp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SpringappApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	// add user
	@Test
	@Transactional
	public void test_case1() throws Exception {
		String newUser = "{\"userId\":\"01\",\"email\":\"test@gmail.com\",\"password\":\"Test@123\",\"username\":\"test123\",\"mobileNumber\":\"9876543210\",\"userRole\":\"user\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/user")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newUser)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// add admin
	@Test
	@Transactional
	public void test_case2() throws Exception {
		String newUser = "{\"userId\":\"02\",\"email\":\"testad@gmail.com\",\"password\":\"Testad@123\",\"username\":\"testad123\",\"mobileNumber\":\"9876543210\",\"userRole\":\"admin\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/admin")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newUser)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// add referee
	@Test
	@Transactional
	public void test_case3() throws Exception {
		String newUser = "{\"refereeId\":\"01\",\"refereeName\":\"testref\",\"noOfMatches\":\"20\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/addReferee")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newUser)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// get user
	@Test
	@Transactional
	public void test_case4() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/user")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty())
				.andReturn();
	}

	// get referee
	@Test
	@Transactional
	public void test_case5() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/getReferee")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").isNotEmpty())
				.andReturn();
	}

	// update user by id
	@Test
	@Transactional
	public void test_case6() throws Exception {
		String newUser = "{\"userId\":\"01\",\"email\":\"testuser2@gmail.com\",\"password\":\"test@123\",\"username\":\"testuser2\",\"mobileNumber\":\"9876543210\",\"userRole\":\"user\"}";
		mockMvc.perform(MockMvcRequestBuilders.put("user/editUser/01")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newUser)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// delete user by id
	@Test
	@Transactional
	public void test_case7() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/01")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// delete referee by id
	@Test
	@Transactional
	public void test_case8() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/deleteReferee/01")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

}
