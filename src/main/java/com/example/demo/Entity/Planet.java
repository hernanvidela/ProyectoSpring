package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="api_planeta")
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="planet_id")
	private int id;
	
	@Column(name="planet_name")
	private String name;
	
	
	@Column(name="planet_size")
	private double size;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Star> estrellas = new ArrayList();
	
	public Planet() {
		
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
	public List<Star> getEstrellas(){
		return estrellas;
	}
	public void setEstrellas(List<Star> estrellas) {
		
		this.estrellas=estrellas;
	}
	
}
