package com.softtek.medicine.data;

import java.util.HashMap;
import java.util.Iterator;
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
	public List<Incident> getAllIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Incident> getIncidentsByFilters(HashMap<Object, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveOrUpdateIncident(Incident incident) {
		try {
			em.persist(incident);
		} catch (Exception e) {
			return "error";
		}

		return "OK";
	}

	@Override
	public String saveOrUpdateIncidents(List<Incident> incidentList) {

		for (Iterator<Incident> it = incidentList.iterator(); it.hasNext();) {
			Incident incident = it.next();

			em.persist(incident);
			em.flush();
			em.clear();
		}

		em.persist(incidentList);
		return "OK";
	}

}
