package com.example.test.testExample;

import com.example.test.testExample.Controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(UserController.class)
public class TestExampleApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() throws Exception {

		mockMvc.perform(get("/users"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Hola mundo")));
	}

}
