package com.rendezvous.service;

import com.rendezvous.domain.HairActor;

public interface HairActorService {

	public void addActor(HairActor actor);
	
	public void updateActor(HairActor actor);
	
	public void deleteActor(Long id);
}
