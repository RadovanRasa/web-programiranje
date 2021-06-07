package com.example.FitnesCentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FitnesCentar.entity.FitnesCentar;
import com.example.FitnesCentar.repository.FitnesCentarRepository;

@Service
public class FitnesCentarService {
	@Autowired
	private FitnesCentarRepository fitnesCentarRepository;
	
	public FitnesCentar save(FitnesCentar f) {
		return this.fitnesCentarRepository.save(f);
	}
}
