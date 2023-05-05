package com.educandoweb.course;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

	@Bean
	public GroupedOpenApi apiGroup() {
		String packagesToscan[] = { "com.educandoweb.course.resources" };
		return GroupedOpenApi.builder()
				.group("API do aplicativo")
				.pathsToMatch("/v1/**")
				.packagesToScan(packagesToscan)
				.build();
	}
}