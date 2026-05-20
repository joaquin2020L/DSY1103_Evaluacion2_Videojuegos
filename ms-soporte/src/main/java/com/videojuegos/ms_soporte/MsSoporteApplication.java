package com.videojuegos.ms_soporte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsSoporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSoporteApplication.class, args);
	}

}
