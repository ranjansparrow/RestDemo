package cs.edu.restdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserNormalController {
	@RequestMapping("/showusers")
	public String showUsers(){
		return "showUser";
	}
	
	@RequestMapping("/addUser")
	public String addUsers(){
		return "addFile";
	}
}
