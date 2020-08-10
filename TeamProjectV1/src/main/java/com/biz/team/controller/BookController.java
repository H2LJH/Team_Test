package com.biz.team.controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.bind.annotation.RequestMapping;

@Configurable
public class BookController 
{
	
	@RequestMapping(value = "")
	public String list()
	{
		return "book/list";
	}
}
