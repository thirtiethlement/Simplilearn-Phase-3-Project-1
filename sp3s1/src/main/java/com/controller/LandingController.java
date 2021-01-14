package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.UserDao;
import com.model.UserInfo;

@Controller
public class LandingController 
{
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(path = "/")
	public String welcome()
	{
		return "hello";
	}
	
	@RequestMapping(path = "/idCheck")
	public String idCheck(Model model, @RequestParam Integer id)
	{
		if (userDao.existsById(id))
		{
			UserInfo userInfo = userDao.findById(id).get();
			model.addAttribute("id", id);
			model.addAttribute("username", userInfo.getUsername());
			model.addAttribute("password", userInfo.getPassword());
			return "displayUser";
		}
		else
		{
			return "invalidId";
		}
	}
	
	@RequestMapping(path = "/newUser")
	public String newUser()
	{
		return "newUser";
	}
	
	@RequestMapping(path = "/registration")
	public String register(@RequestParam String username, @RequestParam String password)
	{
		UserInfo user = new UserInfo();
		user.setUsername(username);
		user.setPassword(password);
		userDao.save(user);
		return "hello";
	}
	
	@RequestMapping(path = "/idEdit")
	public String editUserEntity(@RequestParam Integer id, @RequestParam String username, @RequestParam String password)
	{
		UserInfo userInfo = userDao.findById(id).get();
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		userDao.save(userInfo);
		return "hello";
	}
}
