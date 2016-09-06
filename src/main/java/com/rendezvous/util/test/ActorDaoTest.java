package com.rendezvous.util.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

//import java.util.stream.LongStream;
import com.rendezvous.domain.HairActor;

@Repository(value="actorDaoTest")
public class ActorDaoTest {

	private Map<Long, HairActor> actors = new HashMap<Long, HairActor>();

	public ActorDaoTest() {
		for(long i=1; i<6; i++) {
			actors.put(new Long(i), new HairActor(i, i%2==0, "fname_"+i, "sname_"+i, "210111_"+i));
		}
		//LongStream.rangeClosed(1, 5).forEach((i) -> actors.put(new Long(i), new HairActor(i, i%2==0, "fname_"+i, "sname_"+i, "210111_"+i)));
	}
	
	
	public HairActor getActor(Long id) {
		if(actors.containsKey(id))
			return actors.get(id);
		else 
			return null;
	}
	public void addActor(HairActor actor) {
		actor.setId(new Long(actors.size()+5));
		actor.setActive(true);
		if(!actors.containsKey(actor.getId()))
			actors.put(actor.getId(), actor);
	}
	
	public void removeActor(HairActor actor) {
		if(actors.containsKey(actor.getId()))
			actors.remove(actor.getId());
	}
	
	public Map<Long, HairActor> getAll() {
		return this.actors;
	}

	public void updateActor(HairActor actor) {
		if(actors.containsKey(actor.getId()))
			actors.put(actor.getId(), actor);
	}
	
	public void printAll() {
		for(Entry<Long, HairActor> entry : actors.entrySet()){
			System.out.println(entry.toString());
		}
		//actors.forEach((k,v) -> System.out.println(v.toString()));
	}
}
