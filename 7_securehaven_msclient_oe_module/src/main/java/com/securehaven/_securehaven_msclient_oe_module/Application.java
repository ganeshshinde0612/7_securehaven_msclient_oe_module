package com.securehaven._securehaven_msclient_oe_module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {
	
	@Bean
	public RestTemplate rt()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
