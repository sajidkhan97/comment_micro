package com.example.comment_micro.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comment_micro.config.RestTemplateConfig;
import com.example.comment_micro.entity.Comments;

import com.example.comment_micro.payload.Post;
import com.example.comment_micro.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	
	
	@Autowired
	private CommentRepository repo;
	@Autowired
	private RestTemplateConfig restTemplate;

	@Override
	public Comments saveComments(Comments cmt) {
		Post post=restTemplate.getRestTemplate().getForObject("http://POST-SERVICE/api/post/"+cmt.getPostId(), Post.class);
		if(post!=null) {
			
		String commentId = UUID.randomUUID().toString();
		cmt.setCommentId(commentId);
		Comments comment=repo.save(cmt);
		return comment;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Comments> getAllComments() {
		List<Comments> findAll = repo.findAll();
		return findAll;
	}
	
	

	@Override
	public List<Comments> getAllCommentsByPostId(String postId) {
		List<Comments> findByPostId = repo.findByPostId(postId);
		return findByPostId;
	}



}
