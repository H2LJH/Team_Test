package com.biz.team.crawling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class test 
{
	@Autowired
	@Scheduled(cron = "0/5 * * * * ? ")
	public void test()
	{
		System.out.println("Testssss");
	}
}
