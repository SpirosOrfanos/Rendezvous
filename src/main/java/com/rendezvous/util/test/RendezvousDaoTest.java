package com.rendezvous.util.test;

import java.util.HashMap;
import java.util.Map;
//import java.util.stream.Collectors;


import org.springframework.stereotype.Repository;

import com.rendezvous.domain.Customer;
import com.rendezvous.domain.Rendezvous;

@Repository(value="rendezvousDaoTest")
public class RendezvousDaoTest {

	private Map<Long, Rendezvous> rendezvousList = new HashMap<Long, Rendezvous>();
	
	public RendezvousDaoTest() {
		
	}
	
	public void addRendezvous(Rendezvous rendezvous) {
		if(!rendezvousList.containsKey(rendezvous.getId()))
			rendezvousList.put(rendezvous.getId(), rendezvous);
	}
	
	public void removeRendezvous(Rendezvous rendezvous) {
		if(rendezvousList.containsKey(rendezvous.getId()))
			rendezvousList.remove(rendezvous.getId());
	}
	
	public void updateRendezvous(Rendezvous actor) {
		if(rendezvousList.containsKey(actor.getId()))
			rendezvousList.put(actor.getId(), actor);
	}
	
	public void printAll() {
		//rendezvousList.forEach((k,v) -> System.out.println(v.toString()));
	}
	
	public  Map<Long, Rendezvous> getAll() {
		return rendezvousList;
	}

	public Map<Long, Rendezvous> lisByCustomer (Customer customer) {
		return null;//rendezvousList.entrySet().stream().filter(map -> map.getValue().getCustomer().getId() == customer.getId()).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
	}
}
