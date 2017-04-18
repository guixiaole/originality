package com.ssm.originality;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.originality.mapper.AdminMapper;
import com.ssm.originality.po.Admin;



public class TestApp {
   
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/applicationContext-dao.xml");
        AdminMapper admindao= (AdminMapper) ac.getBean("adminMapper");
        Admin admin=admindao.selectByPrimaryKey(1);
        System.out.println(admin.getAdname());
	}
}
