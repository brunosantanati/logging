package me.brunosantana.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.debug("Debug log message");
		logger.info("Info log message");
		logger.info("Info log message 2");
		logger.error("Error log message");
		execute();
	}

	private void execute() {
		throw new RuntimeException("Error trying to execute something");
	}
}
