package com.example.FitnesCentar.entity;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sala implements Serializable {
	@Column
	private int kapacitet;
	
	@Id
	@Column
	private String oznaka_sale;
	
	@ManyToOne
	@JoinColumn(name = "fitnes_centar")
	private FitnesCentar fitnes_centar;
			
	@OneToMany (mappedBy = "sala")
	private Set<RasporedTreninga> lista_treninga = new HashSet<RasporedTreninga>();
	
	
	
	public Sala(String oznaka_sale, int kapacitet) {
		this.oznaka_sale = oznaka_sale;
		this.kapacitet = kapacitet;
	}
	
	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public String getOznaka_sale() {
		return oznaka_sale;
	}

	public void setOznaka_sale(String oznaka_sale) {
		this.oznaka_sale = oznaka_sale;
	}

	@Override
	public String toString() {
		return "Sala [kapacitet=" + kapacitet + ", oznaka_sale=" + oznaka_sale + "]";
	}

	
	
}
