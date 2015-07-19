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
import com.vpath.em.model.Hotel;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmployeeApplication.class)
public class HotelServiceTests {

	@Autowired
	HotelService hotelService;

	@Autowired
	CityService cityService;

	@Test
	public void getHotelTest() {
		City city = null;
		city = cityService.getCity("Brisbane", "Australia");

		String name = "Conrad Treasury Place";

		Hotel hotel = this.hotelService.getHotel(city, name);
		assertThat(hotel.getName(),is( name));
	}
}
//insert into city(country, name, state, map) values ('Australia', 'Brisbane', 'Queensland', '-27.470933, 153.023502')
//insert into hotel(city_id, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001')
