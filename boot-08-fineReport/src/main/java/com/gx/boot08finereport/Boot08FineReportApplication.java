package com.gx.boot08finereport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Boot08FineReportApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Boot08FineReportApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Boot08FineReportApplication.class);
	}

}
