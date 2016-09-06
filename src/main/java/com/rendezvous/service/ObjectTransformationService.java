package com.rendezvous.service;

import java.util.Date;

import com.rendezvous.domain.Customer;
import com.rendezvous.domain.HairAction;
import com.rendezvous.domain.HairActor;
import com.rendezvous.domain.Offer;
import com.rendezvous.domain.Rendezvous;

public interface ObjectTransformationService {
	public Rendezvous createRendezvous(long id, Customer customer, HairAction action, 
			HairActor hairActor, Date date, Offer offer);
	
	public HairActor createHairActor(long id, String fname, String sname, String phone);
}
