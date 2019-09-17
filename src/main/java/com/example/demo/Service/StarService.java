package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.DTO.StarDTO;
import com.example.demo.Entity.Star;
import com.example.demo.Repository.StarRepository;

@Service
public class StarService {

	private StarRepository starRepository;
	

	public StarService(StarRepository starRepository) {
		this.starRepository = starRepository;
	}
	


	
	public StarDTO getOne(int id) {	
		Optional<Star> bd = starRepository.findById(id);
		StarDTO starDTO = new StarDTO();
		
		try {

			Star star = bd.get();			
			starDTO.setId(star.getId());
			starDTO.setName(star.getName());
			starDTO.setDensity(star.getDensity());	
			
			
			return starDTO;
			
		} catch (Exception e) {
			
			return starDTO;
		}
		
	}
	public List<StarDTO> getAll(){	
		List<StarDTO> lista = new ArrayList<>();	
		// comunico la lectura al repositorio y me devuelve Entidad
		for (Star star : starRepository.findAll()) {
			// cargo de la entidad al Dto			
			StarDTO temp = new StarDTO();
			temp.setId(star.getId());
			temp.setName(star.getName());
			temp.setDensity(star.getDensity());
			
//			Cargo a cada elemento el dto
			lista.add(temp);	
			
		}
		
		return lista;
		
	}
	
	
	
	public StarDTO post(StarDTO starDTO) {		
		Star star = new Star();		
		star.setId(starDTO.getId());
		star.setName(starDTO.getName());
		star.setDensity(starDTO.getDensity());	
	
		try {			
			starRepository.save(star);			
		} catch (Exception e) {						
		}	
		starDTO.setId(star.getId());
		return starDTO;
		
	}
	
	public StarDTO put(StarDTO starDTO, int id) {
		Optional<Star> temp = starRepository.findById(id);			
		try {		
			Star star = temp.get();
			star.setName(starDTO.getName());
			star.setDensity(starDTO.getDensity());
			
			starRepository.save(star);		
			starDTO.setId(star.getId());		
		} catch (Exception e) {			
		}			
		return starDTO;	
	}
	
	public boolean delete(int id) {
		Optional<Star> temp = starRepository.findById(id);	
		try {					
			starRepository.delete(temp.get());
			return true;		
		} catch (Exception e) {
			return false;
			
		}
		
	}
}
