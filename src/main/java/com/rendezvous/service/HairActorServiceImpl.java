package com.rendezvous.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rendezvous.domain.HairActor;
import com.rendezvous.util.test.ActorDaoTest;

@Service("hairActorService")
public class HairActorServiceImpl implements HairActorService {

	@Autowired
	ActorDaoTest actorDaoTest;
	
	
	@Override
	public void addActor(HairActor actor) {
		actorDaoTest.addActor(actor);
		
	}
	public void setActorDaoTest(ActorDaoTest actorDaoTest) {
		this.actorDaoTest = actorDaoTest;
	}
	@Override
	public void updateActor(HairActor actor) {
		actorDaoTest.updateActor(actor);
		
	}
	@Override
	public void deleteActor(Long id) {
		actorDaoTest.removeActor(actorDaoTest.getActor(id));		
	}
	

}
