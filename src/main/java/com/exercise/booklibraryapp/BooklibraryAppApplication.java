package com.exercise.booklibraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BooklibraryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooklibraryAppApplication.class, args);
	}

}
