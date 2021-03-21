package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.CommentDTO;
import com.example.demo.mapper.CommentMapper;

@SpringBootTest
public class CommentTests {

	@Autowired
	private CommentMapper commentMapper;
	
	@Test
	public void registerComments() {
		
		int number = 20;
		
		for (int i = 1 ; i <= number ; i++) {
			CommentDTO params = new CommentDTO();
			params.setBoardIdx((long) 53);
			params.setContent(i + "번 댓글 입니다.");
			params.setWriter(i + "번 댓글 글쓴이");
			commentMapper.insertComment(params);
		}
	}
	
	@Test
	public void deleteComment() {
		
		commentMapper.deleteComment((long) 10);
		
		getCommentList();
	}
	
	@Test
	public void getCommentList() {
		
		CommentDTO params = new CommentDTO();
		params.setBoardIdx((long) 53);
		
		commentMapper.selectCommentList(params);
	}
}
