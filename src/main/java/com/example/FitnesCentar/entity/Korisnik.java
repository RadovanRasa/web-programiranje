package com.example.FitnesCentar.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


enum Uloge{Administrator, Trener, Clan}

@Entity
public class Korisnik implements Serializable {
	@Id
	@Column
	protected String korisnicko_ime;
	@Column
	protected String lozinka;
	@Column
	protected String ime;
	@Column
	protected String prezime;
	@Column
	protected String telefon;
	@Column
	protected String email;
	@Column
	protected String datum_rodjenja;
	@Column
	protected Uloge uloga;
	@Column
	protected boolean aktivan;
	
	public Korisnik(String korisnicko_ime, String ime, String prezime, String telefon, String email,
			String datum_rodjenja, Uloge uloga, boolean aktivan, String lozinka) {
		super();
		this.korisnicko_ime = korisnicko_ime;
		this.ime = ime;
		this.prezime = prezime;
		this.telefon = telefon;
		this.email = email;
		this.datum_rodjenja = datum_rodjenja;
		this.uloga = uloga;
		this.aktivan = aktivan;
		this.lozinka = lozinka;
	}
	
	
}
