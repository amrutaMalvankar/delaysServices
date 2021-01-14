package com.fedex.delays.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DelaysController {
	

    private static final Logger log = LoggerFactory.getLogger(DelaysController.class);
	
	@GetMapping(value = "/delays")
	public ResponseEntity<String> verifyDelays() {
	
		log.info("Verifying call :: ************ ");
		return new ResponseEntity<>("Welcome to delays project :: ", HttpStatus.OK);
	}


}
