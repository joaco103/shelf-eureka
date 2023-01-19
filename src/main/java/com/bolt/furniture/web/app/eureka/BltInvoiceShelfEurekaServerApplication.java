package com.bolt.furniture.web.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BltInvoiceShelfEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BltInvoiceShelfEurekaServerApplication.class, args);
	}

}
