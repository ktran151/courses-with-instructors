package org.wecancodeit.courseswithinstructors;

import org.junit.Test;

import junit.framework.Assert;

public class CourseTopicTest {
	CourseTopic underTest = new CourseTopic("James");

	@Test
	public void shouldHaveAName() {
		String result = underTest.getName();
		Assert.assertEquals("James", result);
	}
}
