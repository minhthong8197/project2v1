/*package project2v1.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import project2v1.model.Post;
import project2v1.repository.PostRepo;

@Service
@Transactional
public class PostService {
	final PostRepo repository;

	public PostService(PostRepo repo) {
		super();
		this.repository = repo;
	}

	public Post findbyId(int id) {
		return repository.findOne(id);
	}

	public List<Post> findall() {
		List<Post> posts = new ArrayList<Post>();
		for (Post p : repository.findAll()) {
			posts.add(p);
		}
		return posts;
	}

	public void save(Post post) {
		repository.save(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
	
	 * public Post findbytitle(String title) { for (Post p : repository.findAll()) {
	 * if(p.getTittle().equals(title)); return p; } return null; }
	 
	
	 * public List<String> findalltitle() { List<String> posttitles = new
	 * ArrayList<>(); for (Post p : repository.findAll()) {
	 * posttitles.add(p.getTittle()); } return posttitles; }
	 
}
*/