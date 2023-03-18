package com.wonui.homework.nurse_home18.DAO;

import java.util.ArrayList;
import java.util.List;

import com.wonui.homework.nurse_home18.DAO.Impl.IAdminDAO;
import com.wonui.homework.nurse_home18.entity.Admin;

public class AdminDAO implements IAdminDAO {

	@Override
	public Admin login(String loginName, String pwd) {
		// TODO Auto-generated method stub
		for (Admin admin : adminInit()) {
			if (loginName.equals(admin.getName()) && pwd.equals(admin.getPwd())) {
				return admin;
			}
		}
		return null;
	}

	private static List<Admin> adminInit() {
		Admin admin1 = new Admin(1, "1234", "1234", "1234");
		Admin admin2 = new Admin(1, "123", "123", "123");
		List<Admin> admins = new ArrayList<Admin>();
		admins.add(admin1);
		admins.add(admin2);
		return admins;
	}
}
