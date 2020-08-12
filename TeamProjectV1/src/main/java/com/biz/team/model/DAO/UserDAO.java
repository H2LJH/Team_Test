package com.biz.team.model.DAO;

import java.util.List;

import com.biz.team.model.UserVO;

public interface UserDAO 
{
	public int join(UserVO userVO);
	
	public UserVO findByUser(String userEmail);
	
	public List<UserVO> selectAll();
}
