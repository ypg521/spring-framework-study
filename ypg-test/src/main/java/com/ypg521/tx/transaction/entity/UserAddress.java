package com.ypg521.tx.transaction.entity;

/**
 * Created by ypg on 09/07/2017
 +---------+--------------+--------+-------+-----------+----------------+
 | Field   | Type         | Null   | Key   |   Default | Extra          |
 |---------+--------------+--------+-------+-----------+----------------|
 | id      | bigint(20)   | NO     | PRI   |    <null> | auto_increment |
 | user_id | bigint(20)   | NO     |       |    <null> |                |
 | address | varchar(255) | NO     |       |    <null> |                |
 | status  | tinyint(4)   | NO     |       |    <null> |                |
 +---------+--------------+--------+-------+-----------+----------------+
 *
 */
public class UserAddress {
	private Long id;
	private Long userId;
	private String address;
	private Byte status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}
}
