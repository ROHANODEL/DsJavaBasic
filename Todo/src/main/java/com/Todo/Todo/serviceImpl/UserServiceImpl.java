package com.Todo.Todo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Todo.Todo.dto.UserDto;
import com.Todo.Todo.exception.ResourceNotFoundException;
import com.Todo.Todo.model.EducationEntities;
import com.Todo.Todo.model.ProjectEntities;
import com.Todo.Todo.model.UserEntities;
import com.Todo.Todo.repository.UserRepo;
import com.Todo.Todo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<UserDto> getAllUsers(){
		List<UserEntities> users = this.userRepo.findAll();
		List<UserDto> userDtos = users.stream().map(user->this.userToDto(user)).collect(Collectors.toList());
		return userDtos;	
		}
	
	@Override
	public UserDto createUser(UserDto userValue) {
		UserEntities user = this.dtoToUser(userValue);
		UserEntities saveUser = this.userRepo.save(user);
		return this.userToDto(saveUser);
	}
	
	@Override
	public void deleteUser(Integer userId) {
		UserEntities user = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User","Id",userId));
		this.userRepo.delete(user);
	}
	
	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		UserEntities user1 = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User","Id",userId));
		user1.setId(userDto.getId());
		user1.setName(userDto.getName());
		user1.setSurname(userDto.getSurname());
		user1.setEmail(userDto.getEmail());
		user1.setAbout(userDto.getAbout());
		
		UserEntities updatedUser = this.userRepo.save(user1);
		UserDto userDto1 = this.userToDto(updatedUser);
		
		return userDto1;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		UserEntities user = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "Id", userId));
//	    WorkEntities user = this.workRepo.findById(userid).orElseThrow();
		return this.userToDto(user);
	}
	
	
	public UserEntities dtoToUser(UserDto userDto)
	{
		UserEntities user = this.modelMapper.map(userDto, UserEntities.class);
		for(EducationEntities edu: user.getEducations()) {
			edu.setUserEntities(user);
		}
		
		return user;

		//		User user = new User();
//		user.setId(userDto.getId());
//		user.setName(userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user.setAbout(userDto.getAbout());
//		user.setPassword(userDto.getPassword());
//		return user;		
	}
	

	public UserDto userToDto(UserEntities userEntities)
	{
		UserDto userDto = this.modelMapper.map(userEntities, UserDto.class);
		return userDto;
//		UserDto userDto = new UserDto();
//		userDto.setId(user.getId());
//		userDto.setName(user.getName());
//		userDto.setSurname(user.getSurname());
//		userDto.setEmail(user.getEmail());
//		userDto.setAbout(user.getAbout());
//		return userDto;
	}
}
