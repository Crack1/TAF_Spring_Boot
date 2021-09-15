package com.udemy.spring.springselenium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

@SpringBootTest
public class SpringSeleniumApplication {

    @Autowired
    private User user;

    @Test
    void contextLoads() {
        user.printDetails();
    }

/*	@Test
	void contextLoad(){
		Address address = new Address();
		Salary salary = new Salary();
		User user = new User(address, salary);
		user.printDetails();
	}*/

}
