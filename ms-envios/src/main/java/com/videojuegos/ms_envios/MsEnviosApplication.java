package com.videojuegos.ms_envios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsEnviosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEnviosApplication.class, args);
	}

}
