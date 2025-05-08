package org.zerock.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;
import org.zerock.service.HelloService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/sample/*")
public class SampleController {
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private final HelloService helloService;
	
	@RequestMapping(value="/basic", method= {RequestMethod.GET,RequestMethod.POST})
	public void basic() {
		log.debug("basic......");
	}
	
	@GetMapping(value="/basicOnlyGet")
	public void basicOnlyGet() {
		log.info("basicOnlyGet......");
	}
	
	@GetMapping("/hello")
	public void hello() {
		log.info("hello......");
		log.info(helloService.sayHello());
	}
	
	@GetMapping(value="/ex01")
	public String ex01(SampleDTO dto) {
		log.info("dto="+dto);
		
		return "ex01";
	}
	
	@GetMapping(value="/ex02List")
	public String ex02List(@RequestParam("ids")ArrayList<String> ids) {
		log.info("ids="+ids);
		
		return "ex02List";
	}
	
	@GetMapping(value="/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		log.info("dto="+dto);
		log.info("page="+page);
		
		return "/sample/ex04";
	}
	
	@GetMapping(value="/ex07")
	public ResponseEntity<String> ex07() {
		log.info("ex07");
		
		String msg = "{'name':'홍길동'}";
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(msg, header, HttpStatus.OK);
	}
}
