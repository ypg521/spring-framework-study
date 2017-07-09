package com.ypg521.tx.transaction.dao;

import com.ypg521.tx.transaction.entity.UserAccount;
import com.ypg521.tx.transaction.entity.UserAddress;
import org.springframework.stereotype.Repository;

/**
 * Created by ypg on 09/07/2017.
 */
@Repository
public interface UserAddressMapper {
	void insert (UserAddress  userAddress);

}
