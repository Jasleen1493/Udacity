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
@Table(schema = "jasleen_test_schema",name="FEEDBACK")
public class feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "ISSUE")
	private String issue;
	
	@Column(name = "DEPARTMENT")
	private String department;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "ISSUE_DESCRIPTOR")
	private String issueDescriptor;

}
