package com.ypg521.tx.transaction.service;

import com.ypg521.tx.transaction.dao.UserAccountMapper;
import com.ypg521.tx.transaction.dao.UserAddressMapper;
import com.ypg521.tx.transaction.entity.UserAccount;
import com.ypg521.tx.transaction.entity.UserAddress;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by ypg on 09/07/2017.
 */
@Service
public class UserService {
	@Autowired
	private UserAddressMapper userAddressMapper;
	@Autowired
	private UserAccountMapper userAccountMapper;

	@Transactional
	public void saveUserInfo(String userName, String address) {
		Date now = new Date();
		UserAccount userAccount = new UserAccount();
		userAccount.setUserName(userName);
		userAccount.setPassWord(String.valueOf(RandomUtils.nextInt(10000, 99999)));
		userAccount.setCreateTime(now);
		userAccount.setUpdateTime(now);
		userAccountMapper.insert(userAccount);


		UserAddress userAddress = new UserAddress();
		userAddress.setUserId(userAccount.getUserId());
		userAddress.setStatus(Byte.valueOf("1"));
		userAddress.setAddress(address);

		userAddressMapper.insert(userAddress);

	}
}
