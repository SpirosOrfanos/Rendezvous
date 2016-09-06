package com.rendezvous.service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rendezvous.domain.Customer;
import com.rendezvous.domain.HairAction;
import com.rendezvous.domain.HairActor;
import com.rendezvous.domain.Offer;
import com.rendezvous.domain.Rendezvous;
import com.rendezvous.util.test.RendezvousDaoTest;

@Service("rendezvousService")
public class RendezvousServiceImpl implements RendezvousService{

	@Autowired
	ObjectTransformationService objectTransformationService;
	@Autowired 
	RendezvousDaoTest rendezvousDaoTest;
	
	@Override
	public void addRendezvous(long id, Customer customer, HairAction action, HairActor hairActor, Date date, Offer offer) {
		rendezvousDaoTest.addRendezvous(objectTransformationService.createRendezvous(id, customer, action, hairActor, date, offer));
		
	}
	public ObjectTransformationService getObjectTransformationService() {
		return objectTransformationService;
	}
	public void setObjectTransformationService(
			ObjectTransformationService objectTransformationService) {
		this.objectTransformationService = objectTransformationService;
	}

	public  Map<Long, Rendezvous> getAllRendezvous() {
		return rendezvousDaoTest.getAll();
	}
	
	
}
