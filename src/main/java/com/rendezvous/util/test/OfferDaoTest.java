package com.rendezvous.util.test;

import java.util.HashMap;
import java.util.Map;
//import java.util.stream.LongStream;


import org.springframework.stereotype.Repository;

import com.rendezvous.domain.Offer;
@Repository(value="offerDaoTest")
public class OfferDaoTest {
	private Map<Long, Offer> offers = new HashMap<Long, Offer>();
	public OfferDaoTest() {
		//LongStream.rangeClosed(0, 4).forEach((i) -> offers.put(new Long(i), new Offer(new Long(i), (10*new Double(i)))));
		for(long i=1; i<6; i++) {
			offers.put(new Long(i), new Offer(new Long(i), (10*new Double(i))));
		}
	}
	
	public void printAll() {
		//offers.forEach((k,v) -> System.out.println(v.toString()));
	}
	
	public Map<Long, Offer> getAll() {
		return offers;
	}
}
