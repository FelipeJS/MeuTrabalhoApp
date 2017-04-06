package br.com.workme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MeuTrabalhoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MeuTrabalhoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MeuTrabalhoApplication.class);
	}
}
