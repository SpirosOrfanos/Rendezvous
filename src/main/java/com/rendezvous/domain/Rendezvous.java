package com.rendezvous.domain;

import java.io.Serializable;
import java.util.Date;

import com.rendezvous.domain.enums.RendezvouStatus;

public class Rendezvous implements Serializable {

	private static final long serialVersionUID = 3736987691408341083L;
	
	private long id;
	
	private Customer customer;
	
	private HairAction action;
	
	private HairActor hairActor;
	
	private Date date;
	
	private Offer offer;
	
	private double cost;
	
	private RendezvouStatus status;
	
	public Rendezvous(long id, Customer customer, HairAction action, HairActor hairActor, Date date, Offer offer, double cost) {
		this.id = id;
		this.customer = customer;
		this.action = action;
		this.hairActor = hairActor;
		this.date = date;
		this.offer = offer;
		this.cost = cost;
		this.status = RendezvouStatus.BOOKED;
	}
	
	public Rendezvous() {
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public HairAction getAction() {
		return action;
	}
	public void setAction(HairAction action) {
		this.action = action;
	}
	public HairActor getHairActor() {
		return hairActor;
	}
	public void setHairActor(HairActor hairActor) {
		this.hairActor = hairActor;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Offer getOffer() {
		return offer;
	}
	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	public RendezvouStatus getStatus() {
		return status;
	}

	public void setStatus(RendezvouStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rendezvous [id=");
		builder.append(id);
		if(null!=customer) {
			builder.append(", customer=");
			builder.append(customer.toString());
		}
		if(null!=action) {
			builder.append(", action=");
			builder.append(action.toString());
		}
		if(null!=hairActor){
			builder.append(", hairActor=");
			builder.append(hairActor.toString());
		}
		
		builder.append(", date=");
		builder.append(date);
		if(null!=offer){
			builder.append(", offer=");
			builder.append(offer.toString());
		}
		
		builder.append(", status=");
		builder.append(status);
		
		builder.append("]");
		return builder.toString();
	}
	
}
