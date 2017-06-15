package br.com.trinity.saladereuniao.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.trinity.saladereuniao.controller.MeetingController;
import br.com.trinity.saladereuniao.controller.TeamController;

@SpringBootApplication
@ComponentScan(basePackageClasses = { TeamController.class, MeetingController.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
