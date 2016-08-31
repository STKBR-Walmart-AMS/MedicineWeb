package com.softtek.medicine.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

@Component
@Entity
@Table(name = "Incident", uniqueConstraints = @UniqueConstraint(columnNames = { "incidentNumber" }))
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Incident implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5658712043010075352L;

	@Id
	@GeneratedValue
	private Long id;
	
	private Date createdDate;

	/* mandatory fields */
	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "incidentNumber cannot be empty")
	private String incidentNumber; // 1000000161

	@NotNull
	@Min(1)
	private Integer priority; // 1000000164

	@NotNull
	@Min(1)
	private Integer impact; // 1000000163

	@NotNull
	@Min(1)
	private Integer urgency; // 1000000162

	@NotNull
	@Min(1)
	private Integer serviceType; // 1000000099

	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "contactCompany cannot be empty")
	private String contactCompany; // 1000000082

	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "categorizationTier1 cannot be empty")
	private String categorizationTier1; // 1000000063

	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "categorizationTier2 cannot be empty")
	private String categorizationTier2; // 1000000064

	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "phoneNumber cannot be empty")
	private String phoneNumber; // 1000000056

	@NotNull
	@Size(min = 1, max = 50)
	@NotEmpty(message = "firstName cannot be empty")
	private String firstName; // 1000000019

	@NotNull
	@Size(min = 1, max = 50)
	@NotEmpty(message = "lastName cannot be empty")
	private String lastName; // 1000000018

	@NotNull
	@Size(min = 1, max = 500)
	@NotEmpty(message = "description cannot be empty")
	private String description; // 1000000000

	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "ProductCategorizationTier1 cannot be empty")
	private String ProductCategorizationTier1; // 200000003

	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "ProductCategorizationTier2 cannot be empty")
	private String ProductCategorizationTier2; // 200000004

	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "productCategorizationTier3 cannot be empty")
	private String productCategorizationTier3; // 200000005
	/* mandatory fields */

	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "entryId cannot be empty")
	private String entryId; // 1

	@Size(min = 1, max = 25)
	private String submitter; // 2

	@Past
	private Date submitDate; // 3

	@Size(min = 1, max = 25)
	private String template; // 303558600

	@Size(min = 1, max = 25)
	private String lastModifiedBy; // 5

	@Past
	private Date lastModifiedDate; // 6

	@Min(1)
	private Integer status; // 7

	@Size(min = 1, max = 25)
	private String createdBy; // 300617700

	@Size(min = 1, max = 50)
	private String customer; // 303530000

	@Size(min = 1, max = 50)
	private String company; // 1000000001

	@Size(min = 1, max = 100)
	private String fullName; // 1000000017

	public Incident() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	@JsonSerialize(using=DateSerializer.class)
	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ProductCategorizationTier1 == null) ? 0 : ProductCategorizationTier1.hashCode());
		result = prime * result + ((ProductCategorizationTier2 == null) ? 0 : ProductCategorizationTier2.hashCode());
		result = prime * result + ((categorizationTier1 == null) ? 0 : categorizationTier1.hashCode());
		result = prime * result + ((categorizationTier2 == null) ? 0 : categorizationTier2.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((contactCompany == null) ? 0 : contactCompany.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((entryId == null) ? 0 : entryId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((impact == null) ? 0 : impact.hashCode());
		result = prime * result + ((incidentNumber == null) ? 0 : incidentNumber.hashCode());
		result = prime * result + ((lastModifiedBy == null) ? 0 : lastModifiedBy.hashCode());
		result = prime * result + ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((productCategorizationTier3 == null) ? 0 : productCategorizationTier3.hashCode());
		result = prime * result + ((serviceType == null) ? 0 : serviceType.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((submitDate == null) ? 0 : submitDate.hashCode());
		result = prime * result + ((submitter == null) ? 0 : submitter.hashCode());
		result = prime * result + ((template == null) ? 0 : template.hashCode());
		result = prime * result + ((urgency == null) ? 0 : urgency.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incident other = (Incident) obj;
		if (ProductCategorizationTier1 == null) {
			if (other.ProductCategorizationTier1 != null)
				return false;
		} else if (!ProductCategorizationTier1.equals(other.ProductCategorizationTier1))
			return false;
		if (ProductCategorizationTier2 == null) {
			if (other.ProductCategorizationTier2 != null)
				return false;
		} else if (!ProductCategorizationTier2.equals(other.ProductCategorizationTier2))
			return false;
		if (categorizationTier1 == null) {
			if (other.categorizationTier1 != null)
				return false;
		} else if (!categorizationTier1.equals(other.categorizationTier1))
			return false;
		if (categorizationTier2 == null) {
			if (other.categorizationTier2 != null)
				return false;
		} else if (!categorizationTier2.equals(other.categorizationTier2))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (contactCompany == null) {
			if (other.contactCompany != null)
				return false;
		} else if (!contactCompany.equals(other.contactCompany))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (entryId == null) {
			if (other.entryId != null)
				return false;
		} else if (!entryId.equals(other.entryId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (impact == null) {
			if (other.impact != null)
				return false;
		} else if (!impact.equals(other.impact))
			return false;
		if (incidentNumber == null) {
			if (other.incidentNumber != null)
				return false;
		} else if (!incidentNumber.equals(other.incidentNumber))
			return false;
		if (lastModifiedBy == null) {
			if (other.lastModifiedBy != null)
				return false;
		} else if (!lastModifiedBy.equals(other.lastModifiedBy))
			return false;
		if (lastModifiedDate == null) {
			if (other.lastModifiedDate != null)
				return false;
		} else if (!lastModifiedDate.equals(other.lastModifiedDate))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (productCategorizationTier3 == null) {
			if (other.productCategorizationTier3 != null)
				return false;
		} else if (!productCategorizationTier3.equals(other.productCategorizationTier3))
			return false;
		if (serviceType == null) {
			if (other.serviceType != null)
				return false;
		} else if (!serviceType.equals(other.serviceType))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (submitDate == null) {
			if (other.submitDate != null)
				return false;
		} else if (!submitDate.equals(other.submitDate))
			return false;
		if (submitter == null) {
			if (other.submitter != null)
				return false;
		} else if (!submitter.equals(other.submitter))
			return false;
		if (template == null) {
			if (other.template != null)
				return false;
		} else if (!template.equals(other.template))
			return false;
		if (urgency == null) {
			if (other.urgency != null)
				return false;
		} else if (!urgency.equals(other.urgency))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Incident [incidentNumber=" + incidentNumber + ", priority=" + priority + ", impact=" + impact
				+ ", urgency=" + urgency + ", serviceType=" + serviceType + ", contactCompany=" + contactCompany
				+ ", categorizationTier1=" + categorizationTier1 + ", categorizationTier2=" + categorizationTier2
				+ ", phoneNumber=" + phoneNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", description=" + description + ", ProductCategorizationTier1=" + ProductCategorizationTier1
				+ ", ProductCategorizationTier2=" + ProductCategorizationTier2 + ", productCategorizationTier3="
				+ productCategorizationTier3 + ", entryId=" + entryId + ", submitter=" + submitter + ", submitDate="
				+ submitDate + ", template=" + template + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDate="
				+ lastModifiedDate + ", status=" + status + ", createdBy=" + createdBy + ", customer=" + customer
				+ ", company=" + company + ", fullName=" + fullName + "]";
	}

}
