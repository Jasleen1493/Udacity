package com.jasleen.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(schema = "jasleen_test_schema",name="POWERSUPPLY")
public class PowerSupply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "BRAND")
	private String brand;
	
	@Column(name = "EFFICIENCY")
	private float efficiency;
	
	@Column(name = "MAXIMUM_POWER")
	private String maximumPower;
	
	@Column(name = "MODEL")
	private String Model;
	
	@Column(name = "PRICE")
	private float price;
	
}
