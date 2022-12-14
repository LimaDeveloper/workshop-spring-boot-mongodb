package com.leandro.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leandro.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Brown", "maria@gamil.com");
		User leandro = new User("2", "Leandro Green", "leandro@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, leandro));
		return ResponseEntity.ok().body(list);
	}
}
