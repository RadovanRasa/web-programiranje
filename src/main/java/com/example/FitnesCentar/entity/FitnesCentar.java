package com.example.FitnesCentar.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.standard.DateTimeAtCompleted;
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


@Entity
public class FitnesCentar implements Serializable {
	
	@Id
	@Column
	private String naziv;
	@Column
	private String adresa;
	@Column
	private String br_tel;
	@Column
	private String Email;
	
	@OneToMany (mappedBy = "fitnes_centar")
	private Set<Trener> treneri = new HashSet<Trener>();
	
	@OneToMany (mappedBy = "fitnes_centar")
	private Set<Sala> sale = new HashSet<Sala>();
	
	

}
