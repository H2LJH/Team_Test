package com.biz.team.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.team.crawling.test;
import com.biz.team.model.UserVO;

@Controller
public class UserController 
{
	//@Autowired
	//private UserService userService;
	
	@Autowired
	test ad;
	
	
	@RequestMapping(value = "/")
	public String main()
	{
		return "home";
	}
	
	/*
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String login(UserVO vo, HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		//UserVO checkID = userService.findByUser(vo.getUserEmail());
		
		if(checkID != null)
			session.setAttribute("user", checkID);
				
		return "redirect:/";
	}
	
	@RequestMapping(value = "logout")
	public String logout(HttpServletRequest req)
	{
		HttpSession Session = req.getSession();
		Session.invalidate();
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login()
	{
		return "user/login";
	}
	*/
}
