package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CfgServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(CfgServerApplication.class, args);
	}
}
