package com.biz.team.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.team.model.UserVO;
import com.biz.team.model.DAO.UserDAO;

// @Service
public class UserServiceImplV1 implements UserService
{
	@Autowired
	private SqlSession sqlSession;
	private UserDAO userDAO;
	
	@Autowired
	public void GetMapper()
	{
		userDAO = sqlSession.getMapper(UserDAO.class);
	}
	
	@Override
	public int join(UserVO userVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserVO findByUser(String userEmail) 
	{
		return userDAO.findByUser(userEmail);
	}

	@Override
	public List<UserVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
