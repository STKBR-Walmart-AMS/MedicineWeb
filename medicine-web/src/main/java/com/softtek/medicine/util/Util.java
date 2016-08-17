package com.softtek.medicine.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bmc.arsys.api.ARException;
import com.bmc.arsys.api.ARServerUser;
import com.bmc.arsys.api.Constants;
import com.bmc.arsys.api.Entry;
import com.bmc.arsys.api.Field;
import com.bmc.arsys.api.OutputInteger;
import com.bmc.arsys.api.QualifierInfo;
import com.bmc.arsys.api.SortInfo;
import com.softtek.medicine.model.Incident;

public class Util {
	HashMap<Object, Object> map = new HashMap<Object, Object>();
	
	private String user;
	private String pass;
	private ARServerUser ctx;
	private String formName = "HPD:Help Desk";
	private String groupName = "BRL - Maintenance Softtek BR HD";
	private String submitDate = "7/1/2016 12:00:00 AM";
	private String qualStr = "( \'Assigned Group\' = \"" + groupName + "\" AND \'Submit Date\' > \"" + submitDate
			+ "\" )";

	
	
	
	
	public HashMap<Object, Object> getRemedyList(String user, String pass) {
		this.user = user;
		this.pass = pass;
		this.ctx = this.login(this.user, this.pass);
//      queryEntrysByQual();
		this.cleanup();
		return map;

	}
	
	private ARServerUser login(String user, String pass) {
		ARServerUser ctx = new ARServerUser();
		ctx.setServer("BSMReports");
		ctx.setPort(24341);
		ctx.setUser(user);
		ctx.setPassword(pass);

		try {
			ctx.verifyUser();
		} catch (ARException e) {
			map.put("error","Falha Login : -------"+ e.getMessage());
		}
		System.out.println("Connected to AR Server " + ctx.getServer());
		return ctx;
	}
	
	public void cleanup() {
		// Logout the user from the server. This releases the resource
		// allocated on the server for the user.
		ctx.logout();
		System.out.println();
		System.out.println("User logged out.");
	}


	public void queryEntrysByQual() {
		List<Entry> entryList = new ArrayList<Entry>();
		List<Incident> lstIncident = new ArrayList<Incident>();


		try {
			// Retrieve the detail info of all fields from the form.
			List<Field> fields = ctx.getListFieldObjects(formName);
			// Create the search qualifier.
			QualifierInfo qual = ctx.parseQualification(qualStr, fields, null, Constants.AR_QUALCONTEXT_DEFAULT);

			int[] fieldIds = { 1000000164, // priority
					1000000163, // impact
					1000000162, // urgency
					1000000161, // incidentNumber
					1000000099, // serviceType
					1000000082, // contactCompany
					1000000063, // categorizationTier1
					1000000064, // categorizationTier2
					1000000056, // phoneNumber
					1000000019, // firstName
					1000000018, // lastName
					1000000000, // description
					200000003, // ProductCategorizationTier1
					200000004, // ProductCategorizationTier2
					200000005, // productCategorizationTier3
					1, // entryId
					2, // submitter
					3, // submitDate
					5, // lastModifiedBy
					6, // lastModifiedDate
					7, // status
					1000000001 // company
			};

			OutputInteger nMatches = new OutputInteger();
			List<SortInfo> sortOrder = new ArrayList<SortInfo>();
			sortOrder.add(new SortInfo(2, Constants.AR_SORT_DESCENDING));
			// Retrieve entries from the form using the given
			// qualification.
			entryList = ctx.getListEntryObjects(formName, qual, 0, Constants.AR_NO_MAX_LIST_RETRIEVE, sortOrder,
					fieldIds, true, nMatches);

			for (Entry lst : entryList) {
				if (!lst.values().isEmpty()) {
					Incident incident = new Incident();
					Object[] list = lst.values().toArray();

					/* mandatory fields */
					incident.setEntryId(list[0] == null ? null : list[0].toString()); // 1
					/* mandatory fields */
					incident.setPriority(list[1] == null ? null : Integer.parseInt(list[1].toString())); // 1000000164
					incident.setImpact(list[2] == null ? null : Integer.parseInt(list[2].toString())); // 1000000163
					incident.setUrgency(list[3] == null ? null : Integer.parseInt(list[3].toString())); // 1000000162
					incident.setIncidentNumber(list[4] == null ? null : list[4].toString()); // 1000000161
					incident.setServiceType(list[5] == null ? null : Integer.parseInt(list[5].toString())); // 1000000099
					incident.setContactCompany(list[6] == null ? null : list[6].toString()); // 1000000082
					incident.setCategorizationTier1(list[7] == null ? null : list[7].toString()); // 1000000063
					incident.setCategorizationTier2(list[8] == null ? null : list[8].toString()); // 1000000064
					incident.setPhoneNumber(list[9] == null ? null : list[9].toString()); // 1000000056
					incident.setFirstName(list[10] == null ? null : list[10].toString()); // 1000000019
					incident.setLastName(list[11] == null ? null : list[11].toString()); // 1000000018
					incident.setDescription(list[12] == null ? null : list[12].toString()); // 1000000000
					incident.setProductCategorizationTier1(list[13] == null ? null : list[13].toString()); // 200000003
					incident.setProductCategorizationTier2(list[14] == null ? null : list[14].toString()); // 200000004
					incident.setProductCategorizationTier3(list[15] == null ? null : list[15].toString()); // 200000005
					/* mandatory fields */
					incident.setSubmitter(list[16] == null ? null : list[16].toString()); // 2
					/**
					 *  TODO VERIFICAR
					 */
					// incident.setSubmitDate(list[17]==null?null: new
					// Date(Long.parseLong(list[17].toString()))); // 3

					incident.setLastModifiedBy(list[18] == null ? null : list[18].toString()); // 5
					// TODO VERIFICAR
					// incident.setLastModifiedDate(list[19]==null?null: new
					// Date(Long.parseLong(list[19].toString()))); // 6
					incident.setStatus(list[20] == null ? null : Integer.parseInt(list[20].toString())); // 7
					incident.setCompany(list[21] == null ? null : list[21].toString()); // 1000000001

					// TODO NOT FOUND
					// String setTemplate(list[0].toString()); // 303558600
					// TODO NOT FOUND
					// String setCreatedBy(list[0].toString()); // 300617700
					// TODO NOT FOUND
					// incident.setCustomer(list[0].toString()); // 303530000
					// TODO NOT FOUND
					// incident.setFullName(list[0].toString()); // 1000000017

					lstIncident.add(incident);

				}
			}
		} catch (Exception e) {
			map.put("error", "falha ao montar objeto : " + e.getMessage());
			
		}
		map.put("incidentList", lstIncident);
		
	}

}
