package com.wonui.homework.nurse_home18.entity;
import java.util.List;

public class OldPeople {

	int id;
	String name;
	int age;
	String idCard;
	double pension;// 退休金
	String health;
	List<Children> childrens;

	public OldPeople() {

	}

	public OldPeople(int id, String name, int age, String idCard, double pension, String health, List<Children> childrens) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.idCard = idCard;
		this.pension = pension;
		this.health = health;
		this.childrens = childrens;
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

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public double getPension() {
		return pension;
	}

	public void setPension(double pension) {
		this.pension = pension;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public List<Children> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Children> childrens) {
		this.childrens = childrens;
	}

	@Override
	public String toString() {
		return "OldPeople [id=" + id + ", name=" + name + ", age=" + age + ", idCard=" + idCard + ", pension=" + pension
				+ ", health=" + health + ", childrens=" + childrens + "]";
	}

	

}
