package com.turtlebone.core.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.turtlebone.core.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
	private static Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
	
	
	
	@Override
	public String sendEmail(List<String> addressList, String title, String template, String alias) {
		
		return null;
	}
	
}
