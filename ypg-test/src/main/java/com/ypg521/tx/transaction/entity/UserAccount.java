package com.ypg521.tx.transaction.entity;

import java.util.Date;

/**
 * Created by ypg on 09/07/2017
 +-------------+--------------+--------+-------+-----------+----------------+
 | Field       | Type         | Null   | Key   |   Default | Extra          |
 |-------------+--------------+--------+-------+-----------+----------------|
 | user_id     | bigint(20)   | NO     | PRI   |    <null> | auto_increment |
 | user_name   | varchar(255) | NO     |       |    <null> |                |
 | pass_word   | varchar(255) | NO     |       |    <null> |                |
 | create_time | datetime     | NO     |       |    <null> |                |
 | update_time | datetime     | NO     |       |    <null> |                |
 +-------------+--------------+--------+-------+-----------+----------------+
 */
public class UserAccount {

	private Long userId;
	private String userName;
	private String passWord;
	private Date createTime;
	private Date updateTime;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "UserAccount{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", passWord='" + passWord + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				'}';
	}
}
