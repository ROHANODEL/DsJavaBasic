package com.Todo.Todo.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenerationTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="project")
@NoArgsConstructor
@Getter
@Setter
public class ProjectEntities {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String name;
	
//	@JsonIgnore
//	@ManyToMany(mappedBy = "projectEntities", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
//	private Set<UserEntities> userEntities;
	
//	@JsonIgnore
//    @OneToMany(targetEntity = UserProjectXref.class, mappedBy = "projectEntities", cascade = CascadeType.ALL)
//    private List<UserProjectXref> userProjectXref;
	
	
//	@JsonIgnore
//	@ManyToMany(mappedBy = "projectEntities", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
//	private List<UserEntities> userEntities;

	
	@JsonIgnore
	@ManyToMany(mappedBy = "projectEntities", cascade = CascadeType.ALL)
	private List<UserEntities> userEntities;

}
