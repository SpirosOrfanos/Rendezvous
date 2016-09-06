package com.rendezvous.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rendezvous.domain.Customer;
import com.rendezvous.domain.HairAction;
import com.rendezvous.domain.HairActor;
import com.rendezvous.domain.Offer;
import com.rendezvous.domain.enums.HairActorStatusEnum;
import com.rendezvous.domain.virtual.HairActorStatus;
import com.rendezvous.util.test.ActorDaoTest;
import com.rendezvous.util.test.CustomerDaoTest;
import com.rendezvous.util.test.HairActionDaoTest;
import com.rendezvous.util.test.OfferDaoTest;

@Service("populateService")
public class PopulateServiceImpl implements PopulateService {
	@Autowired
	private ActorDaoTest actorDaoTest;
	@Autowired
	private CustomerDaoTest customerDaoTest;
	@Autowired
	private HairActionDaoTest hairActionDaoTest;
	@Autowired
	private OfferDaoTest  offerDaoTest;
	
	
	public PopulateServiceImpl() {
	}
	
	
	public Map<Long, HairActor> getAllActors() {
		return actorDaoTest.getAll();
	}
	
	public Map<Long, Customer> getCustomers() {
		return customerDaoTest.getAll();
	}
	
	public Map<Long, HairAction> getAllHairActions() {
		return hairActionDaoTest.getAll();
	}
	
	public Map<Long, Offer> getAllOffers() {
		return offerDaoTest.getAll();
	}

	public void setActorDaoTest(ActorDaoTest actorDaoTest) {
		this.actorDaoTest = actorDaoTest;
	}

	public void setCustomerDaoTest(CustomerDaoTest customerDaoTest) {
		this.customerDaoTest = customerDaoTest;
	}

	public void setHairActionDaoTest(HairActionDaoTest hairActionDaoTest) {
		this.hairActionDaoTest = hairActionDaoTest;
	}

	public void setOfferDaoTest(OfferDaoTest offerDaoTest) {
		this.offerDaoTest = offerDaoTest;
	}


	@Override
	public List<HairActorStatus> getActorStatuses() {
		List<HairActorStatus> response = new ArrayList<HairActorStatus>();
		for(HairActorStatusEnum status : HairActorStatusEnum.values()){
			response.add(new HairActorStatus(status.isStatus(), status.getValue()));
		}
		return response;
	}
}
