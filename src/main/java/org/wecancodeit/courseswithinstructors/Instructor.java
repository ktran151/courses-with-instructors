package org.wecancodeit.courseswithinstructors;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Instructor {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy="instructor")
	private Collection<CourseTopic> courseTopics;
	
	public Instructor() {}
	
	public Instructor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
		public Long getId() {
			return id;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
	
		public Collection<CourseTopic> getCourseTopics() {
			return courseTopics;
		}

}
