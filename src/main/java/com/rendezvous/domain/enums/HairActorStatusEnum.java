package com.rendezvous.domain.enums;

public enum HairActorStatusEnum {

	ACTIVE(true,"ACTIVE"),
	INACTIVE(false,"INACTIVE");
	private boolean status;
	private String value;

	/**
	 * @param status
	 */
	private HairActorStatusEnum(boolean status, String value) {
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
