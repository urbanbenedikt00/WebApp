package edu.fra.uas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.fra.uas.service.FirstS;
import edu.fra.uas.service.SecondS;
import edu.fra.uas.service.ThirdS;

@SpringBootApplication
public class BeanExampleApplication {

	//@Autowired
	//private FirstS firstS;
	//@Autowired
	//private SecondS secondS;
	@Autowired
	private ThirdS thirdS;

	public static void main(String[] args) {
		SpringApplication.run(BeanExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				
			}
		};
		return action;
	}

}
