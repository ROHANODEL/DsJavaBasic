package com.Todo.Todo.service;

import java.util.List;

import com.Todo.Todo.dto.UserDto;
import com.Todo.Todo.model.UserEntities;

public interface UserService {
	
	List<UserDto> getAllUsers();

	UserDto createUser(UserDto userValue);

	void deleteUser(Integer userId);

	UserDto updateUser(UserDto userDto,Integer userId);

	UserDto getUserById(Integer userId);

}
