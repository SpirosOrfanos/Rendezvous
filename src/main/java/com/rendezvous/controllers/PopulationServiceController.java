package com.rendezvous.controllers;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rendezvous.domain.virtual.HairActorStatus;
import com.rendezvous.service.PopulateService;

@RestController
public class PopulationServiceController {
	@Autowired
	PopulateService populateService;
	
	private static final Logger logger = Logger.getLogger(PopulationServiceController.class);
	
	@RequestMapping(value = "/hairactorstatuses/", method = RequestMethod.GET)
	public ResponseEntity<List<HairActorStatus>> listAllHairActorStatus() {
		return new ResponseEntity<List<HairActorStatus>>(populateService.getActorStatuses(), HttpStatus.OK);
	}
	
}
