package com.stackroute.matchmaker.modeltests;


import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.User;

public class RegistrationTest {
	
	private User registration;
	
	@Before
	public void setup() throws Exception {
		registration = new User();
		registration.setEmail("max.payne_234@gmail.com");
		registration.setPassword("password123");
		registration.setUsername("Max234");
	}

	@Test
	public void test() {
		new BeanTester().testBean(User.class);
	}

}
