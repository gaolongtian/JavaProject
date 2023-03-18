package com.wonui.homework.nurse_home18.service;

import com.wonui.homework.nurse_home18.DAO.AdminDAO;
import com.wonui.homework.nurse_home18.DAO.Impl.IAdminDAO;
import com.wonui.homework.nurse_home18.entity.Admin;
import com.wonui.homework.nurse_home18.service.Impl.IAdminService;

public class AdminService implements IAdminService {

	IAdminDAO adminDAO = new AdminDAO();

	@Override
	public Admin login(String loginName, String pwd) {
		// TODO Auto-generated method stub
		Admin admin = adminDAO.login(loginName, pwd);
		return admin;
	}
}
