package org.wecancodeit.courseswithinstructors;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseWithInstructorsController {

	@Resource
	private CourseTopicRepository courseRepo;

	@GetMapping("/")
	public String home() {
		return "index";
	}

}
