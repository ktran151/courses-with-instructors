package org.wecancodeit.courseswithinstructors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CourseTopic {

	@GeneratedValue
	@Id
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public CourseTopic(String name) {
		this.name = name;
	}

}
