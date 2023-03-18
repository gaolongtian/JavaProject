package com.wonui.homework.nurse_home18.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.wonui.homework.nurse_home18.entity.Admin;
import com.wonui.homework.nurse_home18.entity.Children;
import com.wonui.homework.nurse_home18.entity.OldPeople;
import com.wonui.homework.nurse_home18.service.AdminService;
import com.wonui.homework.nurse_home18.service.OldPeopleService;
import com.wonui.homework.nurse_home18.service.Impl.IAdminService;
import com.wonui.homework.nurse_home18.service.Impl.IOldPeopleService;

public class View {

	public static void show() {

		IAdminService adminService = new AdminService();
		IOldPeopleService oldPeopleService = new OldPeopleService();

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("*********养老院管理系统*********");
			System.out.println("请输入管理员手机号码：");
			String telInput = input.next();
			System.out.println("请输入管理员密码：");
			String pwdInput = input.next();

			Admin admin = adminService.login(telInput, pwdInput);
			if (admin != null) {
				System.out.println("登录成功！！！");
				while (true) {
					System.out.println("1-添加老人信息，2-修改老人信息，3-查询所有老人信息");
					System.out.println("4-根据姓名查询信息，5-根据年龄查询信息，6-根据退休金查询信息，7-根据子女职业查询信息");
					System.out.println("输入选择：");
					int selectMenu = input.nextInt();
					if (selectMenu == 1) {

						System.out.println("老人姓名：");
						String nameInput = input.next();
						System.out.println("老人年龄：");
						int ageInput = input.nextInt();
						System.out.println("老人身份证号：");
						String idCardInput = input.next();
						System.out.println("老人退休金：");
						double pensionInput = input.nextInt();
						System.out.println("老人健康状况：");
						String healthInput = input.next();

						List<Children> childrens = new ArrayList<Children>();
						while (true) {
							System.out.println("输入子女信息：");
							System.out.println("子女姓名：");
							String nameChildInput = input.next();
							System.out.println("子女年龄：");
							int ageChildInput = input.nextInt();
							System.out.println("子女性别：");
							String sexChildInput = input.next();
							System.out.println("子女职业：");
							String jobChildInput = input.next();

							Children children = new Children(1, nameChildInput, ageChildInput, sexChildInput,
									jobChildInput);
							childrens.add(children);
							System.out.println("是否继续输入：0-停止，其他-继续");
							int x = input.nextInt();
							if (x == 0) {
								break;
							}
						}

						OldPeople oldPeople = new OldPeople(1, nameInput, ageInput, idCardInput, pensionInput,
								healthInput, childrens);
						List<OldPeople> oList = oldPeopleService.getAll();
						List<OldPeople> newOList = oldPeopleService.add(oldPeople);
						if (newOList.size() == oList.size() + 1) {
							System.out.println("添加成功！");
						} else {
							System.out.println("添加失败！");
						}
					} else if (selectMenu == 2) {
						List<OldPeople> oList = oldPeopleService.getAll();
						for (OldPeople oldPeople : oList) {
							System.out.println(oldPeople);
						}
						System.out.println("输入要修改的老人信息：");
						System.out.println("老人ID：");
						int id = input.nextInt();
						System.out.println("老人姓名：");
						String nameInput = input.next();
						System.out.println("老人年龄：");
						int ageInput = input.nextInt();
						System.out.println("老人身份证号：");
						String idCardInput = input.next();
						System.out.println("老人退休金：");
						double pensionInput = input.nextInt();
						System.out.println("老人健康状况：");
						String healthInput = input.next();

						List<Children> childrens = new ArrayList<Children>();
						while (true) {
							System.out.println("输入子女信息：");
							System.out.println("子女姓名：");
							String nameChildInput = input.next();
							System.out.println("子女年龄：");
							int ageChildInput = input.nextInt();
							System.out.println("子女性别：");
							String sexChildInput = input.next();
							System.out.println("子女职业：");
							String jobChildInput = input.next();

							Children children = new Children(1, nameChildInput, ageChildInput, sexChildInput,
									jobChildInput);
							childrens.add(children);
							System.out.println("是否继续输入：0-停止，其他-继续");
							int x = input.nextInt();
							if (x == 0) {
								break;
							}
						}

						OldPeople oldPeople = new OldPeople(id, nameInput, ageInput, idCardInput, pensionInput,
								healthInput, childrens);
						boolean bool = oldPeopleService.update(oldPeople);
						if (bool) {
							System.out.println("修改成功！");
						} else {
							System.out.println("修改失败！");
						}

					} else if (selectMenu == 3) {
						List<OldPeople> oList = oldPeopleService.getAll();
						for (OldPeople oldPeople : oList) {
							System.out.println(oldPeople);
						}
					} else if (selectMenu == 4) {
						System.out.println("根据姓名查询");
						String name = input.next();
						List<OldPeople> oList = oldPeopleService.getOldPeoplesByName(name);
						if (oList != null) {
							for (OldPeople oldPeople : oList) {
								System.out.println(oldPeople);
							}
						}
					} else if (selectMenu == 5) {
						System.out.println("年龄下限：");
						int ageMin = input.nextInt();
						System.out.println("年龄上限：");
						int ageMax = input.nextInt();
						List<OldPeople> oList = oldPeopleService.getOldPeoplesByAge(ageMin, ageMax);
						if (oList != null) {
							for (OldPeople oldPeople : oList) {
								System.out.println(oldPeople);
							}
						}
					} else if (selectMenu == 6) {
						System.out.println("退休金下限：");
						int moneyMin = input.nextInt();
						System.out.println("退休金上限：");
						int moneyMax = input.nextInt();
						List<OldPeople> oList = oldPeopleService.getOldPeoplesByMoney(moneyMin, moneyMax);
						if (oList != null) {
							for (OldPeople oldPeople : oList) {
								System.out.println(oldPeople);
							}
						}
					} else if (selectMenu == 7) {
						System.out.println("根据子女职业查询");
						String job = input.next();
						List<OldPeople> oList = oldPeopleService.getOldPeoplesByChildJob(job);
						if (oList != null) {
							for (OldPeople oldPeople : oList) {
								System.out.println(oldPeople);
							}
						}
					}
				}

			} else {
				System.out.println("登录失败！！！");
			}
		}
	}

}
