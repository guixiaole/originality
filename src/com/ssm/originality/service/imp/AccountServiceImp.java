package com.ssm.originality.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.originality.mapper.AccountMapper;
import com.ssm.originality.po.Account;
import com.ssm.originality.service.AccountService;
import com.ssm.originality.util.RandomString;
@Service("accountServiceImp")
public class AccountServiceImp implements AccountService {
	@Resource
	private AccountMapper accountMapper;	
	/**
	 * 用户登录的时候 可以用手机号码或者邮箱进行登录
	 * @param account
	 * @return Account
	 * @throws Exception
	 */
	@Override
	public Account loginByUser(Account account) throws Exception {
		return accountMapper.loginByUser(account);
	}


	/**
	 * 当用户进行注册的时候，返回的则是用户的信息
	 * @param account
	 * @return account
	 * @throws Exception
	 */
	@Override
	public Account registByUser(Account account) throws Exception {
		//如果注册的时候名字为空，则随机生成6个字符串的名字
		if(account.getUsername().equals("")|| account.getUsername()==null){
			account.setUsername( RandomString.getString());
		}
		accountMapper.insertSelective(account);
		return accountMapper.loginByUser(account);
	}

}
