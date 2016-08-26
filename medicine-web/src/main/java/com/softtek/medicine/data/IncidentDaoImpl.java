package com.softtek.medicine.data;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softtek.medicine.model.Incident;

@Repository
@Transactional
public class IncidentDaoImpl implements IncidentDao {

	private static final String PERSISTENCE_UNIT_NAME = "pu_medicine";
	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	public List<Incident> getAllIncidents() {
		final EntityManager em = factory.createEntityManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Incident> criteria = cb.createQuery(Incident.class);
			Root<Incident> incident = criteria.from(Incident.class);
			criteria.select(incident).orderBy(cb.asc(incident.get("priority")));
			return em.createQuery(criteria).getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public List<Incident> getIncidentsByFilters(HashMap<Object, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Incident getIncidentsByIncidentNumber(String incidentNumber) {
		final EntityManager em = factory.createEntityManager();
		try {

			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Incident> criteria = cb.createQuery(Incident.class);
			Root<Incident> incident = criteria.from(Incident.class);
			criteria.select(incident).where(cb.equal(incident.get("incidentNumber"), incidentNumber));
			return em.createQuery(criteria).getSingleResult();
		} finally {
			em.close();
		}

	}

	@Override
	public String saveIncident(Incident incident) {
		final EntityManager em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(incident);
			em.getTransaction().commit();
		} catch (Exception e) {
			return "error";
		} finally {
			em.close();
		}

		return "OK";
	}

	@Override
	public String updateIncident(Incident incident) {
		final EntityManager em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(incident);
			em.getTransaction().commit();
		} catch (Exception e) {
			return "error";
		} finally {
			em.close();
		}

		return "OK";
	}

	@Override
	public String saveOrUpdateIncidents(List<Incident> incidentList) {

		try {
			for (Incident lst : incidentList) {
				if (getIncidentsByIncidentNumber(lst.getIncidentNumber()) != null) {
					updateIncident(lst);
				} else {
					saveIncident(lst);
				}

			}
		} catch (Exception e) {
			return "error";
		}
		return "OK";

	}

}
