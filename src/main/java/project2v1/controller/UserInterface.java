package project2v1.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import project2v1.model.Post;
import project2v1.service.PostService;
import project2v1.service.UserService;
import project2v1.upfile.UploadFile;

@Controller
public class UserInterface {

	// Save the uploaded file to this folder
	private static String UPLOADED_FOLDER = "D://temp/";

	@Autowired
	private UserService userservice;
	@Autowired
	private PostService postservice;

	@GetMapping("/")
	public String home(HttpServletRequest request) {
		List<Post> posts = new ArrayList<Post>();
		for (Post p : postservice.findall()) {
			posts.add(p);
		}
		request.setAttribute("posts", posts);
		return "index";
	}

	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		List<Post> posts = new ArrayList<Post>();
		for (Post p : postservice.findall()) {
			posts.add(p);
		}
		request.setAttribute("posts", posts);
		return "login";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();// lay session hien tai
		session.setAttribute("logged", null);
		return "redirect:/";
	}

	@GetMapping("/checklogin")
	public String checklogin(HttpServletRequest request) {
		String tendangnhap = request.getParameter("tendangnhap");
		String matkhau = request.getParameter("matkhau");

		if (userservice.compare(tendangnhap, matkhau) == true) {
			HttpSession session = request.getSession();// lay session hien tai
			session.setAttribute("logged", true);// them attribute vao session
			return "redirect:/managepost";
		} else {
			return "redirect:/login";
		}
	}

	@GetMapping("/uploadfile")
	public String upLoadFile() {
		return "uploadfile";
	}

	@PostMapping("/uploadfilehandling")
	public String uploadFileHandling(@RequestParam("file") MultipartFile file) {
		if (file.isEmpty()) {
			return "redirect:/";
		}

		try {
			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);
			java.io.File up = new File(path.toString());
			UploadFile upload = new UploadFile();
			// upload.uploadFileHandling(up, "cpproject2");
		} catch (IOException e) {
			System.out.println("loi nua roi");
		}
		return "redirect:/";
	}
}