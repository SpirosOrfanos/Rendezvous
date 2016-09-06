package com.rendezvous.util;

import com.rendezvous.domain.HairActor;

public class ObjectUtil {

	public static HairActor  createHairActor(long id, boolean active, String fname, String sname, String phone) {

		return new HairActor(id, active, fname, sname, phone);
	}
}
