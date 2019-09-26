package com.smarthome.ManagingCentre;

import com.sun.javafx.fxml.builder.URLBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagingCentreApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void constructUriWithQueryParameter() {
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.scheme("http").host("192.168.1.195")
				.path("/cm").query("cmnd={keyword}").buildAndExpand("Power%20TOGGLE");
		String elo = "http://192.168.1.195/cm?cmnd=Power%20TOGGLE";
		System.out.println(uriComponents.toUriString());
		assertEquals(elo, uriComponents.toUriString());
	}

}
