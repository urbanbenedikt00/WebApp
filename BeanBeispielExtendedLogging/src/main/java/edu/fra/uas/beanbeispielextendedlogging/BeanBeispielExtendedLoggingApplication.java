package edu.fra.uas.beanbeispielextendedlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.fra.uas.beanbeispielextendedlogging.controller.BeanController;

@SpringBootApplication
public class BeanBeispielExtendedLoggingApplication {

	private static final Logger log = LoggerFactory.getLogger(BeanBeispielExtendedLoggingApplication.class);

	@Autowired
	private BeanController beanController;

	public static void main(String[] args) {
		SpringApplication.run(BeanBeispielExtendedLoggingApplication.class, args);
	}

	@Bean
	CommandLineRunner init() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				log.debug(beanController.putMessage("Hallo Welt"));
				log.debug(beanController.putMessage("--> OOOHOOO <--"));
			}
			
		};
	}

}