package project2v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserInterface {
	 
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/managepost")
	public String managePost() {
		return "managepost";
	}
	@GetMapping("/editpost")
	public String editPost() {
		return "editpost";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/listpost")
	public String listPost() {
		return "listpost";
	}
	@GetMapping("/loadpost")
	public String loadPost() {
		return "loadpost";
	}
	@GetMapping("/newpost")
	public String newPost() {
		return "newpost";
	}
	@GetMapping("/logout")
	public String logout() {
		return "redirect:/";
	}
}
