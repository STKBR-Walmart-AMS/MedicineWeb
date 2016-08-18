package com.softtek.medicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.softtek.medicine.data.IncidentDao;
import com.softtek.medicine.model.Incident;

@RestController
public class IncidentRestController {
	
	@Autowired
	private IncidentDao incidentDao;

	@RequestMapping(value = "/incident", method = RequestMethod.GET, produces = "text/plain")
	public String Bla() {
		return "IncidentRestController OK";
	}
	
	//-------------------Create an Incident--------------------------------------------------------

	@RequestMapping(value = "/incident/json", method = RequestMethod.POST)
	public ResponseEntity<Void> getJson(@RequestBody List<Incident> incidentList, UriComponentsBuilder ucBuilder) {
		
		HttpHeaders headers = new HttpHeaders();
				
		String status = incidentDao.saveOrUpdateIncidents(incidentList);
				
		UriComponents uriComponents = ucBuilder.path("/{msg}").buildAndExpand(status);
	    headers.setLocation(uriComponents.toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);

	}
	
	 @RequestMapping(value="/incidents",method = RequestMethod.GET,headers="Accept=application/json")
	 public List<Incident> getAllIncidents() {	 
	  List<Incident> incident=incidentDao.getAllIncidents();
	  return incident;
	
	 }
	
	
}
