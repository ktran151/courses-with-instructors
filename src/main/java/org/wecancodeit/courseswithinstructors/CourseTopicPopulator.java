package org.wecancodeit.courseswithinstructors;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CourseTopicPopulator implements CommandLineRunner {

	@Resource
	CourseTopicRepository courseRepo;

	@Resource
	InstructorRepository instructorRepo;

	@Override
	public void run(String... args) throws Exception {

		instructorRepo.save(new Instructor("Brian", "Forsythe"));
		instructorRepo.save(new Instructor("Donny", "Hamilton"));
		instructorRepo.save(new Instructor("Alan", "Kostrick"));

		courseRepo.save(new CourseTopic("Spring"));
		courseRepo.save(new CourseTopic("Java"));
		courseRepo.save(new CourseTopic("HTML"));
		courseRepo.save(new CourseTopic("Javascript"));
	}

}
