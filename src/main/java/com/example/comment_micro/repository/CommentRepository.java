package com.example.comment_micro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.comment_micro.entity.Comments;
@Repository
public interface CommentRepository extends JpaRepository<Comments, String> {
	
	List<Comments> findByPostId(String postId);

}
