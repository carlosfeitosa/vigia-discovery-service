package com.magalister.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Discovery service main class.
 * 
 * @author Carlos Feitosa (carlos.feitosa.nt@gmail.com
 * @since 2019-08-25
 *
 */
@EnableAutoConfiguration
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}

}
