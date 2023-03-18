package com.wonui.homework.nurse_home18.service;

import java.util.List;

import com.wonui.homework.nurse_home18.DAO.OldPeopleDAO;
import com.wonui.homework.nurse_home18.DAO.Impl.IOldPeopleDAO;
import com.wonui.homework.nurse_home18.entity.OldPeople;
import com.wonui.homework.nurse_home18.service.Impl.IOldPeopleService;

public class OldPeopleService implements IOldPeopleService {
	
	IOldPeopleDAO oldPeopleDAO = new OldPeopleDAO();

	@Override
	public List<OldPeople> add(OldPeople oldPeople) {
		
		return oldPeopleDAO.add(oldPeople);	
	}

	@Override
	public List<OldPeople> getAll() {
		// TODO Auto-generated method stub
		return oldPeopleDAO.getAll();
	}

	@Override
	public boolean update(OldPeople oldPeople) {
		// TODO Auto-generated method stub
		boolean bool = oldPeopleDAO.update(oldPeople);
		return bool;
	}

	@Override
	public List<OldPeople> getOldPeoplesByName(String name) {
		return oldPeopleDAO.getOldPeoplesByName(name);
	}

	@Override
	public List<OldPeople> getOldPeoplesByAge(int ageMin, int ageMax) {
		// TODO Auto-generated method stub
		return oldPeopleDAO.getOldPeoplesByAge(ageMin, ageMax);
	}

	@Override
	public List<OldPeople> getOldPeoplesByMoney(double moneyMin, double moneyMax) {
		// TODO Auto-generated method stub
		return oldPeopleDAO.getOldPeoplesByMoney(moneyMin, moneyMax);
	}

	@Override
	public List<OldPeople> getOldPeoplesByChildJob(String job) {
		// TODO Auto-generated method stub
		return oldPeopleDAO.getOldPeoplesByChildJob(job);
	}

}
