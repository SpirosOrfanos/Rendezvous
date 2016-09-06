package com.rendezvous.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.rendezvous.domain.Customer;
import com.rendezvous.domain.HairAction;
import com.rendezvous.domain.HairActor;
import com.rendezvous.domain.Offer;
import com.rendezvous.domain.Rendezvous;
import com.rendezvous.util.MathUtil;

@Service("objectTransformationService")
public class ObjectTransformationServiceImpl implements ObjectTransformationService {
	public Rendezvous createRendezvous(long id, Customer customer, HairAction action, HairActor hairActor, Date date, Offer offer) {
		return new Rendezvous(id, customer, action, hairActor, date, offer, MathUtil.calculateOffer(action.getCost(), offer.getValue()));
	}

	@Override
	public HairActor createHairActor(long id, String fname, String sname, String phone) {
		return new HairActor(id, true, fname, sname, phone);
	}
}
