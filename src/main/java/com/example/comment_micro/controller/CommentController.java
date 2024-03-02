package com.example.comment_micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comment_micro.entity.Comments;

import com.example.comment_micro.service.CommentService;

@RestController
@RequestMapping("/api/comment/")
public class CommentController {
	@Autowired
	private CommentService service;
	
	@PostMapping("/saveComment")
	public ResponseEntity<Comments> saveComment(@RequestBody Comments cmt){
	
			Comments comment=service.saveComments(cmt);
			return new ResponseEntity<>(comment,HttpStatus.CREATED);
			
	}
	
	@GetMapping("/getAllComments")
	public List<Comments> getAllComments(){
		List<Comments> getAllComments=service.getAllComments();
		return getAllComments;
	}
	
	@GetMapping("/{postId}")
	public List<Comments> getAllCommentsByPostId(@PathVariable String postId){
		List<Comments> comments=service.getAllCommentsByPostId(postId);
		return comments;
		
	}

}
