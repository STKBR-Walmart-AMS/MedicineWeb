package com.softtek.medicine.service;

import java.util.List;

import com.softtek.medicine.data.IncidentDao;
import com.softtek.medicine.data.MemberDao;
import com.softtek.medicine.model.Incident;
import com.softtek.medicine.model.Member;

public class MedicineServiceImpl implements MedicineService {

	private MemberDao memberDao;
	private IncidentDao incidentDao;

	@Override
	public String saveOrUpdateIncidents(List<Incident> incidentList) {

		incidentDao.saveOrUpdateIncidents(incidentList);

		return "saveOrUpdateIncidents OK";
	}

	@Override
	public String saveOrUpdateMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

}
