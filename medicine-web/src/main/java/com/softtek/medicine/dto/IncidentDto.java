package com.softtek.medicine.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class IncidentDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5658712043010075352L;

	private Long id;

	private String incidentNumber; // 1000000161
	private Integer priority; // 1000000164
	private Integer impact; // 1000000163
	private Integer urgency; // 1000000162
	private Integer serviceType; // 1000000099
	private String contactCompany; // 1000000082
	private String categorizationTier1; // 1000000063
	private String categorizationTier2; // 1000000064
	private String phoneNumber; // 1000000056
	private String firstName; // 1000000019
	private String lastName; // 1000000018
	private String description; // 1000000000
	private String ProductCategorizationTier1; // 200000003
	private String ProductCategorizationTier2; // 200000004
	private String productCategorizationTier3; // 200000005
	private String entryId; // 1
	private String submitter; // 2
	private Date submitDate; // 3
	private String template; // 303558600
	private String lastModifiedBy; // 5
	private Date lastModifiedDate; // 6
	private Integer status; // 7
	private String createdBy; // 300617700
	private String customer; // 303530000
	private String company; // 1000000001
	private String fullName; // 1000000017
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIncidentNumber() {
		return incidentNumber;
	}
	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getImpact() {
		return impact;
	}
	public void setImpact(Integer impact) {
		this.impact = impact;
	}
	public Integer getUrgency() {
		return urgency;
	}
	public void setUrgency(Integer urgency) {
		this.urgency = urgency;
	}
	public Integer getServiceType() {
		return serviceType;
	}
	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}
	public String getContactCompany() {
		return contactCompany;
	}
	public void setContactCompany(String contactCompany) {
		this.contactCompany = contactCompany;
	}
	public String getCategorizationTier1() {
		return categorizationTier1;
	}
	public void setCategorizationTier1(String categorizationTier1) {
		this.categorizationTier1 = categorizationTier1;
	}
	public String getCategorizationTier2() {
		return categorizationTier2;
	}
	public void setCategorizationTier2(String categorizationTier2) {
		this.categorizationTier2 = categorizationTier2;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductCategorizationTier1() {
		return ProductCategorizationTier1;
	}
	public void setProductCategorizationTier1(String productCategorizationTier1) {
		ProductCategorizationTier1 = productCategorizationTier1;
	}
	public String getProductCategorizationTier2() {
		return ProductCategorizationTier2;
	}
	public void setProductCategorizationTier2(String productCategorizationTier2) {
		ProductCategorizationTier2 = productCategorizationTier2;
	}
	public String getProductCategorizationTier3() {
		return productCategorizationTier3;
	}
	public void setProductCategorizationTier3(String productCategorizationTier3) {
		this.productCategorizationTier3 = productCategorizationTier3;
	}
	public String getEntryId() {
		return entryId;
	}
	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}
	public String getSubmitter() {
		return submitter;
	}
	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
	
	HashMap<Object,Object> getFilters(IncidentDto incident){
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		
		
		if(null != incident.getCompany() && !incident.getCompany().equals("")){
			map.put("company", incident.getCompany());
		}
		
		
		
		
		return map;
		
	}
	
	
	
	

}
