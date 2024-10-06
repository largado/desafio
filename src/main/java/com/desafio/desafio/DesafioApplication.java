package com.desafio.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Alexandro Avena
 * dependências utilizadas:
 * - h2 database
 * - OpenFeign
 * - Spring Web
 * - Spring DAta JPa
 */

@SpringBootApplication
@EnableFeignClients
public class DesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

}
