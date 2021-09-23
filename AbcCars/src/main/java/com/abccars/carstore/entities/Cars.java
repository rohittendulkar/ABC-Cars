package com.abccars.carstore.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Cars {

	@Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="manufacterer")
	private String carmanufac;
	
	@Column(name="model")
	private String carmodel;
	
	@Column(name="year")
	private String caryear;
	
	@Column(name="description")
	private String description;
	
	@Column(name="seller")
	private String seller;
		
	public Cars() {
		super();
		
	}

	public Cars(Long id, String carmanufac, String carmodel, String caryear, String description, String seller) {
		super();
		this.id = id;
		this.carmanufac = carmanufac;
		this.carmodel = carmodel;
		this.caryear = caryear;
		this.description = description;
		this.seller = seller;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarmanufac() {
		return carmanufac;
	}

	public void setCarmanufac(String carmanufac) {
		this.carmanufac = carmanufac;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getCaryear() {
		return caryear;
	}

	public void setCaryear(String caryear) {
		this.caryear = caryear;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	}
