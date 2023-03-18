package com.wonui.homework.nurse_home18.DAO;

import java.util.ArrayList;
import java.util.List;

import com.wonui.homework.nurse_home18.DAO.Impl.IOldPeopleDAO;
import com.wonui.homework.nurse_home18.entity.Children;
import com.wonui.homework.nurse_home18.entity.OldPeople;

public class OldPeopleDAO implements IOldPeopleDAO {

	List<OldPeople> oPeoples = oldPeoplesInit();

	@Override
	public List<OldPeople> add(OldPeople oldPeople) {
		// TODO Auto-generated method stub
		oPeoples = oldPeoplesInit();
		oPeoples.add(oldPeople);
		return oPeoples;
	}

	private static List<OldPeople> oldPeoplesInit() {
		List<Children> childrens = null;
		OldPeople oldPeople1 = new OldPeople(1, "1234", 67, "1234", 3000, "健康", childrens);
		OldPeople oldPeople2 = new OldPeople(2, "123", 69, "123", 4000, "糖尿病", childrens);
		OldPeople oldPeople3 = new OldPeople(3, "12", 58, "12", 3500, "风湿病", childrens);
		OldPeople oldPeople4 = new OldPeople(4, "1235", 71, "1235", 2000, "高血压", childrens);
		List<OldPeople> cList = new ArrayList<OldPeople>();
		cList.add(oldPeople1);
		cList.add(oldPeople2);
		cList.add(oldPeople3);
		cList.add(oldPeople4);
		return cList;
	}

	@Override
	public List<OldPeople> getAll() {
		return oPeoples;
	}

	@Override
	public boolean update(OldPeople oPeople) {
		for (int i = 0; i < oPeoples.size(); i++) {
			if (oPeoples.get(i).getId() == oPeople.getId()) {
				oPeoples.set(i, oPeople);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<OldPeople> getOldPeoplesByName(String name) {
		List<OldPeople> oList = new ArrayList<OldPeople>();
		for (OldPeople oldPeople : oPeoples) {
			if (name.equals(oldPeople.getName())) {
				oList.add(oldPeople);
			}
		}
		return oList;
	}

	@Override
	public List<OldPeople> getOldPeoplesByAge(int ageMin, int ageMax) {
		List<OldPeople> oList = new ArrayList<OldPeople>();
		for (OldPeople oldPeople : oPeoples) {
			if (ageMin <= oldPeople.getAge() && ageMax >= oldPeople.getAge()) {
				oList.add(oldPeople);
			}
		}
		return oList;
	}

	@Override
	public List<OldPeople> getOldPeoplesByMoney(double moneyMin, double moneyMax) {
		List<OldPeople> oList = new ArrayList<OldPeople>();
		for (OldPeople oldPeople : oPeoples) {
			if (moneyMin <= oldPeople.getPension() && moneyMax >= oldPeople.getPension()) {
				oList.add(oldPeople);
			}
		}
		return oList;
	}

	@Override
	public List<OldPeople> getOldPeoplesByChildJob(String job) {
		List<OldPeople> oList = new ArrayList<OldPeople>();
		for (OldPeople oldPeople : oPeoples) {
			for (Children children : oldPeople.getChildrens()) {
				if (job.equals(children.getJob())) {
					oList.add(oldPeople);
				}
			}
		}
		return oList;
	}

}
