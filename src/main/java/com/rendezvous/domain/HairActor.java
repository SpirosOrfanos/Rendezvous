package com.rendezvous.domain;

import java.io.Serializable;

public class HairActor implements Serializable {
	
	private static final long serialVersionUID = -1696172098073833512L;
	
	private long id;
	
	public boolean active;
	
	private String fname;
	
	private String sname;
	
	private String phone;
	
	
	public HairActor(long id, boolean active, String fname, String sname, String phone) {
		this.id = id;
		this.active = active;
		this.fname = fname;
		this.sname = sname;
		this.phone = phone;
	}
	
	public HairActor() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HairActor [id=");
		builder.append(id);
		builder.append(", active=");
		builder.append(active);
		builder.append(", fname=");
		builder.append(fname);
		builder.append(", sname=");
		builder.append(sname);
		builder.append(", phone=");
		builder.append(phone);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HairActor other = (HairActor) obj;
		if (active != other.active)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (id != other.id)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	
	

}
