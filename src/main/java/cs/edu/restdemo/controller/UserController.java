package cs.edu.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cs.edu.restdemo.Domain.User;
import cs.edu.restdemo.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	IUserService userservice;
	
	@RequestMapping("/")
	public String welcome(){
		return "index";
	}
	
	@RequestMapping(value = "/users",method = RequestMethod.GET,headers= "Accept= Application/Json")
	public List<User> showUser(){
		List<User> alluser = userservice.findAllUser();
		return alluser;
	}
	@RequestMapping (value = "/users/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") long id){
		System.out.println("Delete bitch");
		userservice.deleteUser(id);
	}
	@RequestMapping(value ="/users", method = RequestMethod.POST)
	public User addUser(@RequestBody User user){
		System.out.println("Save bitch");
		userservice.save(user);
		return user;
	}
}
