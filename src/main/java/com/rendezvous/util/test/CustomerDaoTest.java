package com.rendezvous.util.test;

import java.util.HashMap;
import java.util.Map;
//import java.util.stream.LongStream;


import org.springframework.stereotype.Repository;

import com.rendezvous.domain.Customer;
@Repository(value="customerDaoTest")
public class CustomerDaoTest {

	private Map<Long, Customer> customers = new HashMap<Long, Customer>();
	public CustomerDaoTest() {
		for(long i=1; i<100; i++) {
			customers.put(new Long(i), new Customer(i, "fname_"+i, "sname_"+i, "descr_"+i, "210111_"+i));
		}
		//LongStream.rangeClosed(1, 100).forEach((i) -> customers.put(new Long(i), new Customer(i, "fname_"+i, "sname_"+i, "descr_"+i, "210111_"+i)));
		
	}
	public void printAll() {
		//customers.forEach((k,v) -> System.out.println(v.toString()));
	}
	
	public  Map<Long, Customer> getAll() {
		return customers;
	}
	
	
}
