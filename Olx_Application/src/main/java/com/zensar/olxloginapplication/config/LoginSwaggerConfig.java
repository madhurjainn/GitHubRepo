package com.zensar.olxloginapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
@Configuration
public class LoginSwaggerConfig {
	@Bean
	public Docket getCustomizedDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.zensar.olxloginapplication"))
				.build()
				.apiInfo(getLoginApiInfo());
	}
	@SuppressWarnings("deprecation")
	private ApiInfo getLoginApiInfo() {
		return new ApiInfo("Olx Login","This is the login page of Olx Login Application",
				"1.1.1","http://www.zensar.com ", "Madhur Jain", " ", " ");
	}
}
