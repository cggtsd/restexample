package cgg.restclient.restexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class RestexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestexampleApplication.class, args);
	}

	@Bean
	RestClient restClient() {
		return RestClient.builder().baseUrl("https://jsonplaceholder.typicode.com/").build();
	}

}
