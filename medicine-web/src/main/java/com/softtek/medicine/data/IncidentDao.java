package com.softtek.medicine.data;

import java.util.HashMap;
import java.util.List;

import com.softtek.medicine.model.Incident;

public interface IncidentDao {

	String insertIncidents(Incident incident);

	List<Incident> getAllIncidents();

	List<Incident> getIncidentsByFilters(HashMap<Object, Object> map);

}
