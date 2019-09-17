package com.example.demo.DTO;

import java.util.List;

import com.example.demo.Entity.Star;

public class PlanetDTO {

	private int id;
	private String name;
	private double size;
	private Star estrella;
	
	public PlanetDTO() {
		
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
	public double getSize() {
		return size;
		
	}
	public void setSize(double size) {
		this.size = size;
	}
		
	public Star getEstrella() {
		
		return estrella;
		}
	public void setEstrella(Star estrella) {
		this.estrella=estrella;
	}
	
}
