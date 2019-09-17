package com.example.demo.DTO;

import com.example.demo.Entity.Planet;

public class StarDTO {
	private int id;
	private String name;
	private double density;
	private Planet planeta;
	
	
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
	public Planet getPlaneta(){
		return planeta;
	}
	public void setPlaneta(Planet planeta) {
		
		this.planeta=planeta;
	}
	
}
