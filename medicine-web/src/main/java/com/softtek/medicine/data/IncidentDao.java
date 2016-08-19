package com.softtek.medicine.data;

import java.util.HashMap;
import java.util.List;

import com.softtek.medicine.model.Incident;

public interface IncidentDao {

	List<Incident> getAllIncidents();

	List<Incident> getIncidentsByFilters(HashMap<Object, Object> map);

	String saveOrUpdateIncident(Incident incident);

	String saveOrUpdateIncidents(List<Incident> incidentList);
	
	Incident getIncidentsByIncidentNumber(String incidentNumber);

}
