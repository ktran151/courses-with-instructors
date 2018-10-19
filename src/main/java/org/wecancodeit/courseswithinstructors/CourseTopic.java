package org.wecancodeit.courseswithinstructors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CourseTopic {

	@GeneratedValue
	@Id
	private Long id;
	private String name;
	
	@ManyToOne
	private Instructor instructor;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public CourseTopic() {}

	public CourseTopic(String name, Instructor instructor) {
		this.name = name;
	}

}
