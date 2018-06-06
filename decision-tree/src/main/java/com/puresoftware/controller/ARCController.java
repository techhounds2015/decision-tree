package com.puresoftware.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.puresoftware.model.ARC;
import com.puresoftware.service.ARCService;

@RestController
public class ARCController {
	
	final static Logger logger = LoggerFactory.getLogger(ARCController.class);
	
	@Autowired
	private ARCService arcService;

	@RequestMapping(value = "/getARC", method = RequestMethod.GET, produces = "application/json")
	public ARC getARC(@RequestParam(value= "type", required = true) String type) {		
		ARC arc = new ARC();
		arc.setClaimantLocation("Noida");
		return arc;
	}
}
