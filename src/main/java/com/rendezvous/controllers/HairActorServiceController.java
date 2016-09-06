package com.rendezvous.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import org.apache.log4j.Logger;

import com.rendezvous.domain.HairActor;
import com.rendezvous.service.HairActorService;
import com.rendezvous.service.ObjectTransformationService;
import com.rendezvous.service.PopulateService;


@RestController
public class HairActorServiceController {
	@Autowired
	PopulateService populateService;
	@Autowired
	HairActorService hairActorService;
	@Autowired
	ObjectTransformationService objectTransformationService;

	private static final Logger logger = Logger.getLogger(HairActorServiceController.class);
	
	@RequestMapping(value = "/hairactors/", method = RequestMethod.GET)
	public ResponseEntity<List<HairActor>> listAllHairActors() {
		List<HairActor> actors = new ArrayList<HairActor>(populateService
				.getAllActors().values());
		if (actors.isEmpty()) {
			return new ResponseEntity<List<HairActor>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<HairActor>>(actors, HttpStatus.OK);
	}
	@RequestMapping(value = "/hairactors/", method = RequestMethod.POST)
	 public ResponseEntity<Void>  addActor(@RequestBody HairActor actor, UriComponentsBuilder ucBuilder) {
		hairActorService.addActor(actor);
		HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/hairactors/{id}").buildAndExpand(actor.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);

	}
	
	@RequestMapping(value = "/hairactors/{id}", method = RequestMethod.PUT)
	 public ResponseEntity<HairActor> updateActor(@PathVariable("id") long id, @RequestBody HairActor actor) {
		logger.info("updateActor Id : " + id + " , actor: " + actor.toString());
		hairActorService.updateActor(actor);
		return new ResponseEntity<HairActor>(actor, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/hairactors/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<HairActor> deleteActor(@PathVariable("id") long id) {
		logger.info("deleteActor Id : " + id);
		hairActorService.deleteActor(id);
        return new ResponseEntity<HairActor>(HttpStatus.NO_CONTENT);
    }

}
