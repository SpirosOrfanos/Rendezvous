package com.rendezvous.service;

import java.util.Date;
import java.util.Map;

import com.rendezvous.domain.Customer;
import com.rendezvous.domain.HairAction;
import com.rendezvous.domain.HairActor;
import com.rendezvous.domain.Offer;
import com.rendezvous.domain.Rendezvous;

public interface RendezvousService {

	public void addRendezvous(long id, Customer customer, HairAction action, HairActor hairActor, Date date, Offer offer);
	public  Map<Long, Rendezvous> getAllRendezvous();
	
}
