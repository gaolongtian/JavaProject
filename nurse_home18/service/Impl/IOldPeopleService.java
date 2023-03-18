package com.wonui.homework.nurse_home18.service.Impl;

import java.util.List;

import com.wonui.homework.nurse_home18.entity.OldPeople;

public interface IOldPeopleService {

	public List<OldPeople> add(OldPeople oldPeople);

	public List<OldPeople> getAll();

	public boolean update(OldPeople oldPeople);

	public List<OldPeople> getOldPeoplesByName(String name);

	public List<OldPeople> getOldPeoplesByAge(int ageMin, int ageMax);

	public List<OldPeople> getOldPeoplesByMoney(double moneyMin, double moneyMax);

	public List<OldPeople> getOldPeoplesByChildJob(String job);

}
