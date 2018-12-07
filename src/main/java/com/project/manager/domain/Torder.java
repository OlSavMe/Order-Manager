package com.project.manager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Torder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int qty;
	private String deadline;



	

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "itemid")
	private Item item;
	
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "unitid")
	private Unit unit;
	
	
	
	public Torder() {
		
	}



	public Torder(int qty, String deadline, Item item, Unit unit) {
		super();
		this.qty = qty;
		this.deadline = deadline;
		this.item = item;
		this.unit = unit;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}



	public String getDeadline() {
		return deadline;
	}



	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}



	public Item getItem() {
		return item;
	}



	public void setItem(Item item) {
		this.item = item;
	}



	public Unit getUnit() {
		return unit;
	}



	public void setUnit(Unit unit) {
		this.unit = unit;
	}


	
	

	@Override
	public String toString() {
	
		return "Torder [id=" + id + ", qty=" + qty + ", deadline=" + deadline + ", item=" + this.getItem() + ", unit=" + this.getUnit() + "]";
	
	}







	
}
	