/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.softtek.medicine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softtek.medicine.model.Incident;

@Controller
@RequestMapping(value = "/")
public class IncidentController {

	List<Incident> lstIncident = new ArrayList<Incident>();

	@RequestMapping(method = RequestMethod.GET)
	public String listAllIncidents(Model model) {
				
//		List<Incident> incidentList = new ArrayList<Incident>();
//		
//		Incident incident = new Incident(); 
//		
//		incident.setIncidentNumber("INC90399393");
//		incident.setPriority(1);
//		incident.setImpact(2);
//		incident.setUrgency(3);
//		
//		incidentList.add(incident);
//		
		model.addAttribute("msg", "teste hardcode");
//		
//		model.addAttribute("incidents", incidentList);

		return "index";
	}

//	@RequestMapping(method = RequestMethod.POST)
//	public String registerNewMember(@Valid @ModelAttribute("newMember") RemedyUser newMember, BindingResult result,
//			Model model) {
//		if (!result.hasErrors()) {
//
//			HashMap<Object, Object> map = new HashMap<Object, Object>();
//
//			map = utils.getRemedyList(newMember.getName(), newMember.getPassword());
//
//			if (map.containsKey("error")) {
//				model.addAttribute("error", map.get("error"));
//				return "index";
//			} else if (map.containsKey("incidentList")) {
//				lstIncident.add((Incident) map.get("incidentList"));
//			} else {
//				model.addAttribute("error", "Lista vazia!");
//				return "index";
//			}
//			return "redirect:/";
//
//		} else
//
//		{
//			return "index";
//		}
//	}

}
