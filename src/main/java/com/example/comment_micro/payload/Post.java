package com.example.comment_micro.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	private String postId;
	private String title;
	private String description;
	private String content;
	
	
	public Post() {
		super();
	}
	public Post(String postId, String title, String description, String content) {
		super();
		this.postId = postId;
		this.title = title;
		this.description = description;
		this.content = content;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	

}
