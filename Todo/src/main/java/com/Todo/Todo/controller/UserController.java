package com.Todo.Todo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Todo.Todo.dto.UserDto;
import com.Todo.Todo.model.UserEntities;
import com.Todo.Todo.repository.UserRepo;
import com.Todo.Todo.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/data")
public class UserController {
	
//	@Autowired
//	private UserRepo userRepo;
//	
//	@GetMapping("/users")
//	public List<UserEntities> getAllEmployee(){
//		return userRepo.findAll();
//	}

	@Autowired
	private UserService userService;
	
	@GetMapping("/userdata")
	public ResponseEntity<List<UserDto>> getAllUsers()
	{
		return ResponseEntity.ok(this.userService.getAllUsers());	
	}
	
	@PostMapping("/userdata")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userValue)
	{
		UserDto createUserDto = this.userService.createUser(userValue);
		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}

	
	@DeleteMapping("/userdata/{userId}")
	public String deleteUser(@PathVariable("userId") Integer uid){
		this.userService.deleteUser(uid);
		return "User deleted successfully";
	}

	
	@PutMapping("/userdata/{userId}")
	public ResponseEntity<UserDto> UpdateUser(@Valid @RequestBody UserDto userDto, @PathVariable("userId") Integer uid){
		UserDto updateUser = this.userService.updateUser(userDto, uid);
		return ResponseEntity.ok(updateUser);
	}
	
	@GetMapping("/userdata/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
		return ResponseEntity.ok(this.userService.getUserById(userId));
	}

	

}
