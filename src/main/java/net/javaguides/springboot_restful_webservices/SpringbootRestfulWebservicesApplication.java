package net.javaguides.springboot_restful_webservices;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot Rest Api Documentation",
				description = "Spring Boot Rest Api Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Adib",
						email = "adibmahfuj420@gmail.com",
						url = "https://adibtechtalesspring.blogspot.com/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://adibtechtalesspring.blogspot.com/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot User Management Documentation",
				url = "https://adibtechtalesspring.blogspot.com/user_management.html"
		)
)
public class SpringbootRestfulWebservicesApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
	}

}
