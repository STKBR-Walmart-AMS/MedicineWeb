package com.softtek.medicine.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.medicine.model.Incident;
import com.softtek.medicine.model.Member;

@Repository
@Transactional
public class IncidentDaoImpl implements IncidentDao {
	@Autowired
	private EntityManager em;

	@Override
	public List<Incident> getAllIncidents() {
		 CriteriaBuilder cb = em.getCriteriaBuilder();
	        CriteriaQuery<Incident> criteria = cb.createQuery(Incident.class);
	        Root<Incident> incident = criteria.from(Incident.class);

	        /*
	         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
	         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
	         */

	        criteria.select(incident).orderBy(cb.asc(incident.get("priority")));
	        return em.createQuery(criteria).getResultList();
	}

	@Override
	public List<Incident> getIncidentsByFilters(HashMap<Object, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Incident getIncidentsByIncidentNumber(String incidentNumber) {
		
		
		
		 CriteriaBuilder cb = em.getCriteriaBuilder();
	        CriteriaQuery<Incident> criteria = cb.createQuery(Incident.class);
	        Root<Incident> incident = criteria.from(Incident.class);

	        /*
	         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
	         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
	         */

	        criteria.select(incident).where(cb.equal(incident.get("incidentNumber"), incidentNumber));
	        return em.createQuery(criteria).getSingleResult();
		
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

		
		for(Incident lst: incidentList){
			
		}
		
		
		
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
