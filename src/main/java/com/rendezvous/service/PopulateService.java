package com.rendezvous.service;

import java.util.List;
import java.util.Map;

import com.rendezvous.domain.Customer;
import com.rendezvous.domain.HairAction;
import com.rendezvous.domain.HairActor;
import com.rendezvous.domain.Offer;
import com.rendezvous.domain.virtual.HairActorStatus;

public interface PopulateService {
	
	public Map<Long, HairActor> getAllActors() ;
	
	public Map<Long, Customer> getCustomers() ;
	
	public Map<Long, HairAction> getAllHairActions() ;
	
	public Map<Long, Offer> getAllOffers();
	
	public List<HairActorStatus> getActorStatuses();
}
