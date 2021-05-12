package com.example.bluering_task1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.bluering_task1.Converters","com.example.bluering_task1.Services","com.example.bluering_task1.Controllers"})
@EntityScan(basePackages = {"com.example.bluering_task1.entities"})
@EnableJpaRepositories(basePackages = {"com.example.bluering_task1.repositories"})
public class BlueringTask1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BlueringTask1Application.class, args);
	
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(BlueringTask1Application.class);
	}

}
