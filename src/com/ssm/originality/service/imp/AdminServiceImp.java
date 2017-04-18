package com.ssm.originality.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.originality.mapper.AdminMapper;
import com.ssm.originality.po.Admin;
import com.ssm.originality.service.AdminService;
@Service("adminServiceImp")
public class AdminServiceImp implements AdminService {
	@Resource
	private AdminMapper adminMapper;
	@Override
	public Admin loginAdmin(Admin admin) throws Exception{	
		Admin admin1=adminMapper.loginByUser(admin);
		return admin1;
	}

}
