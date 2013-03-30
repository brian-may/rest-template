package com.rest.template.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/helloworld")
	public @ResponseBody String helloWorld() {
		return "Hello World!";
	}
}
