/*package project2v1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project2v1.model.Post;
import project2v1.service.PostService;

@Controller
public class PostController {

	@Autowired
	private PostService postservice;
	
	@GetMapping("/savepost")
	public String savepost(HttpServletRequest request, @RequestParam String tittle, @RequestParam String content) {
		HttpSession session = request.getSession();// lay session hien tai
		boolean logged;
		try {
			logged = (Boolean) session.getAttribute("logged");
			if (logged == true) {
				Post newpost = new Post(tittle.toString(), content.toString());
				System.out.println("Trước khi lưu bài viết");
				postservice.save(newpost);
				System.out.println("Sau khi lưu bài viết");
				return "redirect:/managepost";
			} else
				return "redirect:/login";
		} catch (Exception e) {
			System.out.println("in savepost");
			return "redirect:/login";
		}
	}

	@GetMapping("/updatepost")
	public String updatepost(HttpServletRequest request, @RequestParam int id, @RequestParam String tittle,
			@RequestParam String content) {
		HttpSession session = request.getSession();// lay session hien tai
		boolean logged;
		try {
			logged = (Boolean) session.getAttribute("logged");
			if (logged == true) {
				Post newpost = new Post(id, tittle.toString(), content.toString());
				System.out.println("Trước khi lưu bài viết");
				postservice.save(newpost);
				System.out.println("Sau khi lưu bài viết");
				return "redirect:/managepost";
			} else
				return "redirect:/login";
		} catch (Exception e) {
			System.out.println("in savepost");
			return "redirect:/login";
		}
	}

	@GetMapping("/managepost")
	public String managepost(HttpServletRequest request) {
		HttpSession session = request.getSession();// lay session hien tai
		boolean logged;
		try {
			logged = (Boolean) session.getAttribute("logged");
			if (logged == true) {
				List<Post> posts = new ArrayList<Post>();
				for (Post p : postservice.findall()) {
					posts.add(p);
				}
				request.setAttribute("posts", posts);
				return "managepost";
			}
		} catch (Exception e) {
			System.out.println("in managepost");
			return "redirect:/login";
		}
		return "redirect:/login";
	}

	@GetMapping("/newpost")
	public String newpost(HttpServletRequest request) {
		HttpSession session = request.getSession();// lay session hien tai
		boolean logged;
		try {
			logged = (Boolean) session.getAttribute("logged") ;
			if (logged == true) {
				List<Post> posts = new ArrayList<Post>();
				for (Post p : postservice.findall()) {
					posts.add(p);
				}
				request.setAttribute("posts", posts);
				return "newpost";
			}

		} catch (Exception e) {
			System.out.println("in newpost");
			return "redirect:/login";
		}
		return "redirect:/login";
	}

	@GetMapping("/editpost")
	public String editpost(HttpServletRequest request) {
		HttpSession session = request.getSession();// lay session hien tai
		boolean logged;
		try {
			logged = (Boolean) session.getAttribute("logged");
			if (logged == true) {
				int postid = Integer.valueOf(request.getParameter("id"));
				Post chosedpost = postservice.findbyId(postid);
				request.setAttribute("chosedpost", chosedpost);

				List<Post> posts = new ArrayList<Post>();
				for (Post p : postservice.findall()) {
					posts.add(p);
				}
				request.setAttribute("posts", posts);

				return "editpost";
			}
		} catch (Exception e) {
			System.out.println("in newpost");
			return "redirect:/login";
		}
		return "redirect:/login";
	}

	@GetMapping("/listpost")
	public String listpost(HttpServletRequest request) {
		List<Post> posts = new ArrayList<Post>();
		for (Post p : postservice.findall()) {
			posts.add(p);
		}
		request.setAttribute("posts", posts);
		return "listpost";
	}

	@GetMapping("/loadpost")
	public String loadpost(HttpServletRequest request) {
		try {
			int postid = Integer.valueOf(request.getParameter("id"));
			Post chosedpost = postservice.findbyId(postid);
			request.setAttribute("chosedpost", chosedpost);

			List<Post> posts = new ArrayList<Post>();
			for (Post p : postservice.findall()) {
				posts.add(p);
			}
			request.setAttribute("posts", posts);

			return "loadpost";
		} catch (Exception e) {
			System.out.println("bắt lỗi khi không truyền id mà đòi xem noi dung bai viet");
			return "redirect:/";
		}
	}
}
*/