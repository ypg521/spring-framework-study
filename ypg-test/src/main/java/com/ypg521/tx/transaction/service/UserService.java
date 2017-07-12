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
	@Autowired
	private UserAdressService userAdressService;

	@Transactional
	public void saveUserInfo(String userName, String address) {
		Date now = new Date();
		UserAccount userAccount = new UserAccount();
		userAccount.setUserName(userName);
		userAccount.setPassWord(String.valueOf(RandomUtils.nextInt(10000, 99999)));
		userAccount.setCreateTime(now);
		userAccount.setUpdateTime(now);
		userAccountMapper.insert(userAccount);
		System.out.println(userAccount);


		UserAddress userAddress = new UserAddress();
		userAddress.setUserId(userAccount.getUserId());
		userAddress.setStatus(Byte.valueOf("1"));
		userAddress.setAddress(address);

		userAddressMapper.insert(userAddress);
		userAdressService.saveAddress(userAccount.getUserId(),String.valueOf(RandomUtils.nextInt(1000000,999999999)));

	}
	@Transactional
	public void saveUserInfoInner(String userName, String address){
		//
		Date now = new Date();
		UserAccount userAccount = new UserAccount();
		userAccount.setUserName(userName);
		userAccount.setPassWord(String.valueOf(RandomUtils.nextInt(10001, 99999)));
		userAccount.setCreateTime(now);
		userAccount.setUpdateTime(now);
		userAccountMapper.insert(userAccount);
		System.out.println(userAccount);


		UserAddress userAddress = new UserAddress();
		userAddress.setUserId(userAccount.getUserId());
		userAddress.setStatus(Byte.valueOf("1"));
		userAddress.setAddress(address);

		userAddressMapper.insert(userAddress);
		saveAddress(userAccount.getUserId(),String.valueOf(RandomUtils.nextInt(1000001,999999999)));
	}

	public void saveAddress(Long accountId, String address) {

	}
}
