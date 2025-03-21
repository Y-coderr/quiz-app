package com.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.quiz", "services", "repositories"})
@EnableJpaRepositories(basePackages = {"repositories"})
public class QuizServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizServiceApplication.class, args);
	}

}
