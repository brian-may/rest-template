package com.rest.template.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.template.domain.Message;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/helloworld.txt", produces="text/plain")
	public @ResponseBody String helloWorld() {
		return "Hello World!";
	}

	@RequestMapping(value="/helloworld.json", produces="application/json")
	public @ResponseBody Map<String,String> helloWorldJson() {
		Map<String,String> messageMap = new HashMap<String, String>();
		messageMap.put("message", "Hello World!");
		return messageMap;
	}

	@RequestMapping(value="/helloworld.xml", produces="application/xml")
	public @ResponseBody Message helloWorldXml() {
		return new Message("Hello World!");
	}
}
