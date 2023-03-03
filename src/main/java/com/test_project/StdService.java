package com.test_project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;

@Service
public class StdService {
	@Autowired
	StdDao sd;
//	@Autowired(required=true)
//	JavaMailSender mailsender;

	public List<Student> getObj() {
		return sd.getObj();
	}
	
//	public void sendEmail(String to,String sub,String content) throws MessagingException {
//		SimpleMailMessage message = new SimpleMailMessage();
//		 
//		message.setFrom("vjharry1807@gmail.com");
//		message.setTo(to);
//		message.setSubject(sub);
//		message.setText(content);
//		 
//		mailsender.send(message);
//		System.out.println("mail sent");
//	}
	
	

}
