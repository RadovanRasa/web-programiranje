package com.example.FitnesCentar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FitnesCentar.entity.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik, String> {
	
}
