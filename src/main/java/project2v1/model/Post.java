package project2v1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name = "tittle")
	String tittle;
	@Column(name = "content")
	String content;

	public Post(String tittle, String content) {
		super();
		this.tittle = tittle;
		this.content = content;
	}

	public Post(int id, String tittle, String content) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.content = content;
	}

	public Post() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", tittle=" + tittle + ", content=" + content + "]";
	}
}