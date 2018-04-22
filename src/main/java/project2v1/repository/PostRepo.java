package project2v1.repository;

import org.springframework.data.repository.CrudRepository;

import project2v1.model.Post;

public interface PostRepo extends CrudRepository<Post, Integer>{

}