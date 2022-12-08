package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication

public class ExamThourayaS2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamThourayaS2Application.class, args);
	}

}
