package com.rendezvous.domain.virtual;

import java.io.Serializable;

public class HairActorStatus implements Serializable{
	
	private static final long serialVersionUID = -1064232397738673996L;
	private boolean status;
	private String value;
	
	public HairActorStatus() {
	}

	public HairActorStatus(boolean status, String value) {
		this.status = status;
		this.value = value;
	}

	public boolean isStatus() {
		return status;
	}

	public String getValue() {
		return value;
	}

}
