package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.pack")
public class SpringBootBasicsApplication extends SpringBootServletInitializer {

	/*public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}*/
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootBasicsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}
}
