package com.wonui.homework.nurse_home18.entity;

public class Children {

	int id;
	String name;
	int age;
	String sex;
	String job;
	OldPeople oldPeople;// 父母

	public Children() {

	}

	public Children(int id, String name, int age, String sex, String job) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.job = job;
	}

	public Children(int id, String name, int age, String sex, String job, OldPeople oldPeople) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.job = job;
		this.oldPeople = oldPeople;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public OldPeople getOldPeople() {
		return oldPeople;
	}

	public void setOldPeople(OldPeople oldPeople) {
		this.oldPeople = oldPeople;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Children [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + ", oldPeople=" + oldPeople
				+ "]";
	}

}
