package com.wonui.homework.nurse_home18.DAO.Impl;

import com.wonui.homework.nurse_home18.entity.Admin;

public interface IAdminDAO {
	
	public Admin login(String loginName,String pwd);
}
