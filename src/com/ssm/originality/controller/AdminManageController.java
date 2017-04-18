package com.ssm.originality.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.originality.po.Admin;
import com.ssm.originality.service.AdminService;

@Controller
public class AdminManageController {
	@Resource
	private AdminService adminService; 
	@RequestMapping("/adminLogin")
	public String adminLogin(Admin admin,HttpServletRequest request)throws Exception{
		Admin admin1=adminService.loginAdmin(admin);
        HttpSession session=request.getSession();
	    session.setAttribute("admin", admin);
		return "jsp/success";	
	}
}
