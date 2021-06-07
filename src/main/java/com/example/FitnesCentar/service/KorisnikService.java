package com.example.FitnesCentar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FitnesCentar.entity.Korisnik;
import com.example.FitnesCentar.repository.KorisnikRepository;

@Service
public class KorisnikService {
	@Autowired
	private KorisnikRepository korisnikRepository;
	
	public Korisnik getOne(String userName) {
		Korisnik korisnik = this.korisnikRepository.getOne(userName);
		return korisnik;
	}
	
	public Korisnik save(Korisnik k) {
		return this.korisnikRepository.save(k);
	}
	
	public List<Korisnik> FindAll(){
		return this.korisnikRepository.findAll();
	}
}









