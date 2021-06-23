package org.gxun.homework.manager;

import org.gxun.homework.manager.core.api.utils.JsonConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;


@SpringBootApplication
@EnableScheduling
@EnableAsync
public class ExamApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}


}