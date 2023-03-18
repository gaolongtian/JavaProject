package com.wonui.homework.nurse_home18.entity;

public class Admin {

	int id;
	String name;
	String tel;
	String pwd;

	public Admin() {
		super();
	}

	public Admin(int id, String name, String tel, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", tel=" + tel + ", pwd=" + pwd + "]";
	}

}
