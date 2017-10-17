package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	public static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/helloworld/", method = RequestMethod.GET)
    public ResponseEntity<List<String>> helloworld() {
		List<String> returnResult = new ArrayList<String>();
		returnResult.add("Hello World!!!");
        return new ResponseEntity<List<String>>(returnResult, HttpStatus.OK);
    }
}
