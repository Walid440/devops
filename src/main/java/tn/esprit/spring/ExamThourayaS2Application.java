package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
@EnableSwagger2WebMvc
public class ExamThourayaS2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamThourayaS2Application.class, args);
	}

}
