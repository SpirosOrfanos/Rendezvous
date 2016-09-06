package com.rendezvous;

/*import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rendezvous.domain.HairActor;
import com.rendezvous.domain.Rendezvous;
import com.rendezvous.domain.service.ObjectTransformationService;
import com.rendezvous.domain.service.PopulateService;
import com.rendezvous.util.MathUtil;
import com.rendezvous.util.ObjectUtil;
import com.rendezvous.util.test.ActorDaoTest;
import com.rendezvous.util.test.CustomerDaoTest;
import com.rendezvous.util.test.OfferDaoTest;
import com.rendezvous.util.test.RendezvousDaoTest;*/

public class Test {

	/*public static void main(String[] args) {
		populateServiceTest();
	}
	
	static void printLine() {
		System.out.println("================================");
	}
	
	static void printObject(Object o) {
		System.out.println(o.toString());
	}
	
	static void printList(Map<Long, Rendezvous> objs) {
		objs.forEach((k,v) -> System.out.println(v.toString()));
	}
	static void testOffer() {
		OfferDaoTest offerDaoTest = new OfferDaoTest();
		offerDaoTest.printAll();
		printLine();
	}
	static void testHairActor() {
		ActorDaoTest actorDaoTest = new ActorDaoTest();
		actorDaoTest.printAll();
		printLine();
		System.out.println(actorDaoTest.getActor(2L));
		HairActor act = actorDaoTest.getActor(2L);
		act.setFname("newname");
		printLine();
		actorDaoTest.printAll();
		actorDaoTest.addActor(ObjectUtil.createHairActor(8l, true, "new sname", "new fname", "90002020"));
		printLine();
		actorDaoTest.printAll();
		act = actorDaoTest.getActor(3L);
		actorDaoTest.removeActor(act);
		printLine();
		actorDaoTest.printAll();
	}
	private static void testCustomerDao() {
		CustomerDaoTest customerDaoTest = new CustomerDaoTest();
		customerDaoTest.printAll();
	}
	
	private static void populateServiceTest() {
		printLine();
		PopulateService populateService = new PopulateService();
		RendezvousDaoTest rendezvousDaoTest = new RendezvousDaoTest();
		ObjectTransformationService objectTransformationService = new ObjectTransformationService();

		rendezvousDaoTest.addRendezvous(objectTransformationService.createRendezvous(1L, 
				populateService.getInstance().getCustomers().get(new Long(1)), 
				populateService.getInstance().getAllHairActions().get(new Long(2)), 
				populateService.getInstance().getAllActors().get(new Long(1)), 
				new Date(), 
				populateService.getInstance().getAllOffers().get(new Long(1))));
		rendezvousDaoTest.addRendezvous(objectTransformationService.createRendezvous(2L, 
				populateService.getInstance().getCustomers().get(new Long(1)), 
				populateService.getInstance().getAllHairActions().get(new Long(1)), 
				populateService.getInstance().getAllActors().get(new Long(1)), 
				new Date(), 
				populateService.getInstance().getAllOffers().get(new Long(1))));
		
		rendezvousDaoTest.addRendezvous(objectTransformationService.createRendezvous(3L, 
				populateService.getInstance().getCustomers().get(new Long(2)), 
				populateService.getInstance().getAllHairActions().get(new Long(1)), 
				populateService.getInstance().getAllActors().get(new Long(1)), 
				new Date(), 
				populateService.getInstance().getAllOffers().get(new Long(2))));
		printList(rendezvousDaoTest.lisByCustomer(populateService.getInstance().getCustomers().get(new Long(1))));
		printLine();
		rendezvousDaoTest.printAll();
	}*/
}
