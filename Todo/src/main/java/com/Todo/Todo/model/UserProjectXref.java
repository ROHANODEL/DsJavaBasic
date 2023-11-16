package com.Todo.Todo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="newuser_project")
@NoArgsConstructor
@Getter
@Setter
public class UserProjectXref {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	@JsonIgnore
	private int id;
	
//	@ManyToOne
//	@JoinColumn(name = "user_id", referencedColumnName="id", foreignKey = @ForeignKey(name = "project_id"))
//	private UserEntities userEntities;
//	
//	@ManyToOne 
//	@JoinColumn(name = "project_id", referencedColumnName="id", foreignKey = @ForeignKey(name = "user_id"))
//	private ProjectEntities projectEntities;
	
	
//	@JsonIgnore
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_id", referencedColumnName="id")
//	private UserEntities userEntities;
//	
//	@JsonIgnore
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "project_id", referencedColumnName="id")
//	private ProjectEntities projectEntities;
	
}
