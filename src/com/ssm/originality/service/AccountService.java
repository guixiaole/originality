package com.ssm.originality.service;

import com.ssm.originality.po.Account;

public interface AccountService {
	/**
	 * 用户登录的时候 可以用手机号码或者邮箱进行登录
	 * @param account
	 * @return Account
	 * @throws Exception
	 */
	Account loginByUser(Account account)throws Exception;
	/**
	 * 用户进行注册的时候，进行
	 * @param account
	 * @return
	 * @throws Exception
	 */
	Account registByUser(Account account)throws Exception;
}
