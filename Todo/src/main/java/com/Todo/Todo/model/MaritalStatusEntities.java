package com.Todo.Todo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user_marital_status")
@NoArgsConstructor
@Getter
@Setter
public class MaritalStatusEntities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "marital_status_id")
	private int statusId;
	
	@Column(name = "marital_status_details")
	private String maritalStatusData;

}
