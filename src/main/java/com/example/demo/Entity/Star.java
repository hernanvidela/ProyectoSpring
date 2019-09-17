package com.example.demo.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="api_star")
public class Star {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="star_id")
	private int id;
	
	@Column(name="star_name")
	private String name;
	
	@Column(name="star_density")
	private double density;	
	
	
	
	public Star() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getDensity() {
		return density;
		
	}
	public void setDensity(double density) {
		this.density = density;
	}
	
}
