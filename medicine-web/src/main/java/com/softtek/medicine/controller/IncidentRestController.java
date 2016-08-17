package com.softtek.medicine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.softtek.medicine.model.Incident;

@RestController
public class IncidentRestController {
	@Autowired
	// private IncidentDao incidentDao;

	@RequestMapping(value = "/incident", method = RequestMethod.GET, produces = "text/plain")
	public String Bla() {
		return "IncidentRestController OK";
	}
	
	//-------------------Create an Incident--------------------------------------------------------

	@RequestMapping(value = "/incident/json", method = RequestMethod.POST)
	public ResponseEntity<String> getJson(@RequestBody Incident incident, UriComponentsBuilder ucBuilder) {

		// Gson gson = new Gson();

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/rest/incident/{id}").buildAndExpand(incident.getIncidentNumber()).toUri());

		return new ResponseEntity<String>("Hello World", headers, HttpStatus.CREATED);

		// return gson.toJson(incident).toString();

	}
}
