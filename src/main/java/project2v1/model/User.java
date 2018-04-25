/*package project2v1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	String user_name;
	@Column(name = "user_pass")
	String user_pass;

	public User(String user_name, String user_pass) {
		super();
		this.user_name = user_name;
		this.user_pass = user_pass;
	}

	public User() {
		super();
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", user_pass=" + user_pass + "]";
	}
}*/