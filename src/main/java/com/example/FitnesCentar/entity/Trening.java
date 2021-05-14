package com.example.FitnesCentar.entity;

import java.io.Serializable;
import java.io.Serializable;
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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Trening implements Serializable {
	@Id
	@Column
	private String naziv;
	
	@Column
	private String opis;
	
	@Column
	private String tip_treninga;
	
	@Column
	private int trajanje;
	
	@ManyToMany(mappedBy = "trening")
	private Set<RasporedTreninga> raspored = new HashSet<RasporedTreninga>();
	
	@OneToMany
	private Set<Ocena> ocene = new HashSet<Ocena>();
	
	@ManyToOne
	@JoinColumn(name = "trener")
	private Trener trener;
	
	@ManyToMany(mappedBy = "odradjeni_trening")
	private Set<Clan> clanovi_odradjeni = new HashSet<Clan>();
	
	@ManyToMany(mappedBy = "pretplaceni_trening")
	private Set<Clan> clanovi_pretplaceni = new HashSet<Clan>();
	
	
	public Trening(String naziv, String opis, String tip_treninga, int trajanje) {
		super();
		this.naziv = naziv;
		this.opis = opis;
		this.tip_treninga = tip_treninga;
		this.trajanje = trajanje;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getTip_treninga() {
		return tip_treninga;
	}

	public void setTip_treninga(String tip_treninga) {
		this.tip_treninga = tip_treninga;
	}

	public int getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}
	
	
	public Set<Ocena> getOcene() {
		return ocene;
	}

	public void setOcene(Set<Ocena> ocene) {
		this.ocene = ocene;
	}

	@Override
	public String toString() {
		return "Trening [naziv=" + naziv + ", opis=" + opis + ", tip_treninga=" + tip_treninga + ", trajanje="
				+ trajanje + "]";
	}
	
	
}
