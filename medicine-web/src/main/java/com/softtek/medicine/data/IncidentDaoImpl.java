package com.softtek.medicine.data;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.medicine.model.Incident;

@Repository
@Transactional
public class IncidentDaoImpl implements IncidentDao {
	@Autowired
	private EntityManager em;

	@Override
	public String insertIncidents(Incident incident) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Incident> getAllIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Incident> getIncidentsByFilters(HashMap<Object, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

}
