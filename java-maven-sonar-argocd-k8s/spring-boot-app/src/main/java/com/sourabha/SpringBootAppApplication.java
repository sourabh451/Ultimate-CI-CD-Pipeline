package com.sourabha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringBootAppApplication {
	
	@GetMapping("/")
	public String index(final Model model) {
		model.addAttribute("title","You have successfully built a spring boot java application using Maven");
		model.addAttribute("msg", "This application is deployed on to Kubernetes using Agro CD by Sourabha Patil");
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}
