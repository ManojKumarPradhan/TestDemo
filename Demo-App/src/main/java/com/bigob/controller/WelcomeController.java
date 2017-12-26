package com.bigob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("era")
	public String welcome() {
		return "Welcome to new ERA";
	}
}
