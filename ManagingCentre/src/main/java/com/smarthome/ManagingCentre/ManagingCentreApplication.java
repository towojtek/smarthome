package com.smarthome.ManagingCentre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ManagingCentreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagingCentreApplication.class, args);
	}

}
