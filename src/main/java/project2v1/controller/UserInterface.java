package project2v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import project2v1.upfile.AmazonService;

@Controller
public class UserInterface {

	/*@Autowired
	private UserService userservice;
	@Autowired
	private PostService postservice;*/
	private AmazonService amazonService;

	/*@GetMapping("/")
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
	}*/

	@GetMapping("/uploadfile")
	public String upLoadFile() {
		return "uploadfile";
	}

	@GetMapping("/uploadfilehandling")
	public String upLoadHandling() {
		return "redirect:/";
	}
	
	@PostMapping("/uploadfilehandling")
	public String uploadFileHandling(@RequestParam("file")MultipartFile file) {
		try {
			amazonService = new AmazonService();
			System.out.println("khoi tao xong amazonService");
			amazonService.uploadFile(file);
			System.out.println("up load file xong");
		} catch (Exception e) {
			System.out.println("loi up file tai controller");
			return "redirect:/";
		}
		return "redirect:/";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
}