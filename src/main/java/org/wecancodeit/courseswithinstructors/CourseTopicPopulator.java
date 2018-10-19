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

		Instructor instructorOne = new Instructor("Brian", "Forsythe");
		Instructor instructorTwo = new Instructor("Donny", "Hamilton");
		Instructor instructorThree = new Instructor("Alan", "Kostrick");

		instructorOne = instructorRepo.save(instructorOne);
		instructorTwo = instructorRepo.save(instructorTwo);
		instructorThree = instructorRepo.save(instructorThree);
		
		courseRepo.save(new CourseTopic("Spring", instructorOne));
		courseRepo.save(new CourseTopic("Java", instructorThree));
		courseRepo.save(new CourseTopic("HTML", instructorTwo));
		courseRepo.save(new CourseTopic("Javascript", instructorTwo));
			
	}

}
