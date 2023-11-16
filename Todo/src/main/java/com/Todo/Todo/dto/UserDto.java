package com.Todo.Todo.dto;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.Todo.Todo.model.EducationEntities;
import com.Todo.Todo.model.MaritalStatusEntities;
import com.Todo.Todo.model.ProjectEntities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
//@Data
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min = 3, message="name must min of 3 character")
	private String name;
	
	@NotEmpty
	private String surname;
	
	@NotEmpty
	@Email(message="email address is not valid")
	private String email;
	
	@NotEmpty
//	@Size(min = 3,max = 50, message="write more about data")
	private String about;
	
	private MaritalStatusEntities maritalSataus;
	
	private List<EducationEntities> educations;	
	
//	private Set<ProjectEntities> projectEntities;
	
	
	private List<ProjectEntities> projectEntities;
		
}

