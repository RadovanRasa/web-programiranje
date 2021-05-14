package com.example.FitnesCentar.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Clan extends Korisnik {

	@OneToMany(mappedBy = "clan")
	private Set<Ocena> ocene = new HashSet<Ocena>();
	
	@ManyToMany
	@JoinTable (name = "Lista_odradjenih_treninga",
	joinColumns = @JoinColumn(name = "clan"),
	inverseJoinColumns = @JoinColumn(name = "odradjeni_trening"))
	private Set<Trening> odradjeni_trening = new HashSet<Trening>();
	
	@ManyToMany
	@JoinTable (name = "Lista_pretplacenih_treninga",
	joinColumns = @JoinColumn(name = "clan"),
	inverseJoinColumns = @JoinColumn(name = "pretplaceni_trening"))
	private Set<Trening> pretplaceni_trening = new HashSet<Trening>();
	
	public Clan(String korisnicko_ime, String ime, String prezime, String telefon, String email, String datum_rodjenja,
			Uloge uloga, boolean aktivan, Set<Ocena> ocene, String lozinka) {

		super(korisnicko_ime, ime, prezime, telefon, email, datum_rodjenja, uloga, aktivan, lozinka);
		this.ocene = ocene;
	}
	
}
