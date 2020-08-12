package com.biz.team.service;

import java.util.List;

import com.biz.team.model.UserVO;

public interface UserService 
{
	public int join(UserVO userVO);
	
	public UserVO findByUser(String userEmail);
	
	public List<UserVO> selectAll();
}
