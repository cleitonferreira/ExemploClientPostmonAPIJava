package br.com.nuvemapp.exemploclientpostmonapijava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import br.com.nuvemapp.exemploclientpostmonapijava.service.PostmonService;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public RestOperations restOperations() {
		return new RestTemplate();
	}
	@Bean
	public br.com.nuvemapp.exemploclientpostmonapijava.service.Localizacao Localizable(){
		return new PostmonService();
	}
}
