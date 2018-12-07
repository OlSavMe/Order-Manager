package com.project.manager.domain;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Unit {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long unitid;
	private String name;
	
	@OneToMany
	private List<Torder> torders;
	
	public Unit() {}

	public Unit(String name) {
		super();
		this.name = name;
	}

	public Long getUnitid() {
		return unitid;
	}

	public void setUnitid(Long unitid) {
		this.unitid = unitid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Torder> getTorders() {
		return torders;
	}

	public void setTorders(List<Torder> torders) {
		this.torders = torders;
	}

	@Override
	public String toString() {
		return "Unit [unitid=" + unitid + ", name=" + name + "]";
	}
	
	

}
