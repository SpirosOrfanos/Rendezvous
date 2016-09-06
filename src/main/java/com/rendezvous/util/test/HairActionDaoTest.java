package com.rendezvous.util.test;

import java.util.HashMap;
import java.util.Map;
//import java.util.stream.LongStream;


import org.springframework.stereotype.Repository;

import com.rendezvous.domain.HairAction;
@Repository(value="hairActionDaoTest")
public class HairActionDaoTest {
	private Map<Long, HairAction> hairActions = new HashMap<Long, HairAction>();
	public HairActionDaoTest() {
		for(long i=1; i<6; i++) {
			 hairActions.put(new Long(i), new HairAction(new Long(i),"Action_"+i, new Double(10 +(10*i))));
		}
		//LongStream.rangeClosed(1, 6).forEach((i) -> hairActions.put(new Long(i), new HairAction(new Long(i),"Action_"+i, new Double(10 +(10*i)))));
	}
	public void printAll() {
		//hairActions.forEach((k,v) -> System.out.println(v.toString()));
	}
	
	public Map<Long, HairAction> getAll() {
		return hairActions;
	}
}
