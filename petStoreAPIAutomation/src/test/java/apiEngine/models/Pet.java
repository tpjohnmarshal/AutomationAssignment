package apiEngine.models;

import java.util.List;

import apiEngine.models.requests.Category;
import apiEngine.models.requests.Tag;

public class Pet {

	public Integer id;
	public Category category;
	public String name;
	public List<String> photoUrls = null;
	public List<Tag> tags = null;
	public String status;

	public Pet(Integer id, Category category, String name, List<String> photoUrls, List<Tag> tags, String status) {
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}

}