package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discounts")
public class Discount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "discount_percentage")
	private float discount_percentage;
	
	@Column(name = "is_active")
	private boolean is_active;
	
	public Discount() {
		
	}
	
	public Discount(String name, String description, float discount_percentage, boolean is_active) {
			this.name = name;
			this.description = description;
			this.discount_percentage = discount_percentage;
			this.is_active = is_active;
		
		}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getDiscount_percentage() {
		return discount_percentage;
	}

	public void setDiscount_percentage(float discount_percentage) {
		this.discount_percentage = discount_percentage;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	
	

}
