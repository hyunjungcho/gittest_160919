package com.example.comment.repo;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.comment.dto.Comment;

@Repository
public class CommentRepoImpl implements CommentRepo{
	private final String NAME_SPACE = "com.example.CommentMapper.";
	
	@Autowired
	SqlSessionTemplate template;
	
	@Override
	public int insert(Comment comment) {
		String statement = NAME_SPACE+"insert";
		return template.update(statement,comment);
	}

}
