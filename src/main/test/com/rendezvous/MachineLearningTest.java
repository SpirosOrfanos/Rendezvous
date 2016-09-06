package com.rendezvous;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.rendezvous.configuration.MainConfiguration;
import com.rendezvous.domain.Customer;
import com.rendezvous.domain.HairAction;
import com.rendezvous.domain.HairActor;
import com.rendezvous.domain.Offer;
import com.rendezvous.domain.Rendezvous;
import com.rendezvous.domain.service.PopulateService;
import com.rendezvous.domain.service.RendezvousService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MainConfiguration.class})
@WebAppConfiguration
public class MachineLearningTest {
	
	@Autowired
    @Qualifier("populateService")
	PopulateService populateService;
	
	@Autowired
    @Qualifier("rendezvousService")
	RendezvousService rendezvousService;
	
	@Test
	public void testPopulation() {
		HairActor hairActor = populateService.getAllActors().get(new Long(1));
		HairAction action = populateService.getAllHairActions().get(new Long(2));
		Offer offer = populateService.getAllOffers().get(new Long(3));
		Customer customer = populateService.getCustomers().get(new Long(6));
		rendezvousService.addRendezvous(1L, customer, action, hairActor, new Date(), offer);
		printList(rendezvousService.getAllRendezvous());
		action = populateService.getAllHairActions().get(new Long(1));
		rendezvousService.addRendezvous(2L, customer, action, hairActor, new Date(), offer);
		printList(rendezvousService.getAllRendezvous());
		
	}
	
	private void printList(Map<Long, Rendezvous> objs) {
		for(Entry<Long, Rendezvous> entry : objs.entrySet()) {
			System.out.println(entry.toString());
		}
		//objs.forEach((k,v) -> System.out.println(v.toString()));
	}
}
