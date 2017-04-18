package com.ssm.originality.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.originality.po.Account;
import com.ssm.originality.service.AccountService;

@Controller
public class AccountManageController {
	    @Resource
        private AccountService accountService;
	    @RequestMapping("/accountLogin")
	    public String accountLogin(Account account,HttpServletRequest request)throws Exception{
			Account account1=accountService.loginByUser(account);
			//将信息放入到session中去
			request.getSession().setAttribute("account", account1);			
	    	//返回主页面
			return "index";
	  	    }
	    @RequestMapping("/accountRegister")
	    public String accountRegister(Account account,HttpServletRequest request)throws Exception{
		   //当用户注册是的时候，没有填名字，随机给予名字（放入到service中设置）
	       	Account account1=accountService.registByUser(account);
	    	//将信息放入到session中去
			request.getSession().setAttribute("account", account1);			
	    	//返回主页面
			return "index";    	
	    }
}
