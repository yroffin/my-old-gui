package org.roffin.lanterna;

import org.roffin.lanterna.services.LanternaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LanternaApplication {

	@Autowired
	LanternaService lanternaService;

	public static void main(String[] args) {
		SpringApplication.run(LanternaApplication.class, args);
	}

}
