package xyz.shanmuavel.spring_ai_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringAiPocApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringAiPocApplication::main).with(TestSpringAiPocApplication.class).run(args);
	}

}
