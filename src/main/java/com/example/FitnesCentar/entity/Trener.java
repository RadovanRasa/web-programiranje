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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Trener extends Korisnik {

	@OneToMany(mappedBy = "trener")
	private Set<Trening> treninzi = new HashSet<Trening>();
	
	@Column
	private double prosecna_ocena;
	
	@ManyToOne
	@JoinColumn(name = "fitnes_centar")
	private FitnesCentar fitnes_centar;
	
	public Trener(String korisnicko_ime, String ime, String prezime, String telefon, String email,
			String datum_rodjenja, Uloge uloga, boolean aktivan, String lozinka) {
		super(korisnicko_ime, ime, prezime, telefon, email, datum_rodjenja, uloga, aktivan, lozinka);
		// TODO Auto-generated constructor stub
	}
	
	private void IzracunajProsecnuOcenu() {
		double suma_ocena=0;
		int broj_ocena=0;
		for(Trening t : treninzi) {
			for(Ocena o : t.getOcene()) {
				suma_ocena += o.getOcena();
				broj_ocena++;
			}
		}
		prosecna_ocena=suma_ocena/broj_ocena;
		
	}

}
