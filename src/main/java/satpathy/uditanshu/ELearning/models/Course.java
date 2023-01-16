package satpathy.uditanshu.ELearning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;

public class Course {
	
	@NotBlank
	@JsonProperty("id")
	private int id;
	
	@NotBlank
	@JsonProperty("name")
	private String name;
	
	@NotBlank
	@JsonProperty("description")
	private String description;
	
	public Course() {
		this.setId(0);
	}
	
	public Course(int id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
	public Course(int id, String name, String description) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
