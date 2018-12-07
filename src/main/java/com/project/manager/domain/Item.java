package com.project.manager.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long itemid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "item", orphanRemoval=true)
	private List<Torder> torders;
	
	public Item() {}

	public Item(String name) {
		super();
		this.name = name;
	
	}

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
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
		return "Item [itemid=" + itemid + ", name=" + name + "]";
	}
	
	

}
