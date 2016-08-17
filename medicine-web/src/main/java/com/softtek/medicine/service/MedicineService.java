package com.softtek.medicine.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.softtek.medicine.model.Incident;
import com.softtek.medicine.model.Member;


@Component 
public interface MedicineService {

	String saveOrUpdateIncidents(List<Incident> inc);
	
	String saveOrUpdateMember(Member member);
		
	
}
