package satpathy.uditanshu.ELearning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;

public class User {

	@NotBlank
	@JsonProperty
	private int id;
	
	@NotBlank
	@JsonProperty("name")
	private String name;
	
	@NotBlank
	@JsonProperty("role")
	private String role;
	
	public User() {
		this.setId(0);
	}

	public User(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public User(int id, String name, String role) {
		this.setId(id);
		this.setName(name);
		this.setRole(role);
	}
	
	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public String getRole() {
		return role;
	}

	private void setRole(String role) {
		this.role = role;
	}
}
