package com.example.FitnesCentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FitnesCentar.entity.RasporedTreninga;
import com.example.FitnesCentar.repository.RasporedTreningaRepository;

@Service
public class RasporedTreningaService {
	@Autowired
	private RasporedTreningaRepository rasporedTreningaRepository;
	
	public List<RasporedTreninga> FindAll(){
		return this.rasporedTreningaRepository.findAll();
	}
	
	public List<RasporedTreninga> SortByName(String Name){
		return this.rasporedTreningaRepository.findAll(org.springframework.data.domain.Sort.by(Name));
	}
	
}
