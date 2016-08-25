package com.softtek.medicine.data;

import java.util.HashMap;
import java.util.List;

import com.softtek.medicine.model.Incident;

public interface IncidentDao {

	public List<Incident> getAllIncidents();

	public List<Incident> getIncidentsByFilters(HashMap<Object, Object> map);

	public Incident getIncidentsByIncidentNumber(String incidentNumber);

	public String saveIncident(Incident incident);

	public String updateIncident(Incident incident);

	public String saveOrUpdateIncidents(List<Incident> incidentList);

}
