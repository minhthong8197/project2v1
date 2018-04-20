package project2v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application {
	
	@Bean
	WebMvcConfigurer configurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addResourceHandlers(ResourceHandlerRegistry registry) {
				registry.addResourceHandler("/img/**").addResourceLocations("/static/");
				registry.addResourceHandler("/css/**").addResourceLocations("/static/css/");
				registry.addResourceHandler("/js/**").addResourceLocations("/static/js/");
				registry.addResourceHandler("/fonts/**").addResourceLocations("/static/fonts/");
				registry.addResourceHandler("/ckeditor/**").addResourceLocations("/static/ckeditor/");
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
