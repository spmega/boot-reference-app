package com.vpath.em.service;



import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vpath.em.EmployeeApplication;
import com.vpath.em.model.City;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmployeeApplication.class)
public class CityServiceTests {

	@Autowired
	CityService service;

	@Test
	public void getCityTest() {
		String name = "San Francisco";
		String country = "USA";
		
		City city = this.service.getCity(name, country);
		assertThat(city.getName(),is( name));
	}
}
