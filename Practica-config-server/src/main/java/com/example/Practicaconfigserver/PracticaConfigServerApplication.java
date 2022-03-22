package com.example.Practicaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PracticaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaConfigServerApplication.class, args);
	}

}
