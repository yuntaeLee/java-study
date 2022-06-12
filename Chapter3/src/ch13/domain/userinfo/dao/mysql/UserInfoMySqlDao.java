package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID: " + userInfo.getUserId());
	}

	@Override
	public void updatetUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userID: " + userInfo.getUserId());		
	}

	@Override
	public void deletetUserInfo(UserInfo userInfo) {
		System.out.println("Delete form MySQL DB userID: " + userInfo.getUserId());		
	}

}
