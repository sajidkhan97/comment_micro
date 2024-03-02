package com.example.comment_micro.service;

import java.util.List;

import com.example.comment_micro.entity.Comments;

public interface CommentService {

	

	Comments saveComments(Comments cmt);

	List<Comments> getAllComments();

	List<Comments> getAllCommentsByPostId(String postId);

	

	

}
