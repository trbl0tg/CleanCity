package ua.legendarytec.CleanCity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@SpringBootApplication
public class CleanCityApplication {
	public static void main(String[] args) {
		SpringApplication.run(CleanCityApplication.class, args);
	}
}
