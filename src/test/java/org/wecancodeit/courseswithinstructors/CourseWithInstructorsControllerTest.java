package org.wecancodeit.courseswithinstructors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//controller matchers
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(CourseWithInstructorsController.class)

public class CourseWithInstructorsControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldBeOkWhenAccessingInstructors() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}

	@Test
	public void shouldGetHome() throws Exception {
		mockMvc.perform(get("/")).andExpect(view().name("index"));
	}

}
