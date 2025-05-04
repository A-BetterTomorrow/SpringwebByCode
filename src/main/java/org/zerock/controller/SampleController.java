package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.service.HelloService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SampleController {
	
	private final HelloService helloService;
	
	@GetMapping("/hello")
	public void hello() {
		System.out.println("hello......");
		System.out.println(helloService.sayHello());
	}
}
