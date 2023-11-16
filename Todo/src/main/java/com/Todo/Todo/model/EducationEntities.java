package com.Todo.Todo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user_education_ruhe_demo")
@NoArgsConstructor
@Getter
@Setter
public class EducationEntities {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "education_id")
	private int educationId;
	
	@Column(name = "education")
	private String education;
	
	@Column(name = "passout_year")
	private Long passYear;
    
//	@ManyToOne
//	@JoinColumn(name = "user_id", referencedColumnName="id")
//	private UserEntities userEntities;
	
//	@JsonIgnore
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "user_id", referencedColumnName="id")
////	@JoinColumn(name = "user_id", referencedColumnName="id", foreignKey = @ForeignKey(name = "FK_Customer"))
//	private UserEntities userEntities;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", referencedColumnName="id")
	private UserEntities userEntities;

}
