package com.ypg521.tx.transaction.service;

import com.ypg521.tx.transaction.dao.UserAccountMapper;
import com.ypg521.tx.transaction.dao.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ypg on 12/07/2017.
 */
@Service
public class UserAdressService {
	@Autowired
	private UserAddressMapper userAddressMapper;
	@Autowired
	private UserAccountMapper userAccountMapper;

	@Transactional
	public void saveAddress(Long accountId, String address) {

	}
}
