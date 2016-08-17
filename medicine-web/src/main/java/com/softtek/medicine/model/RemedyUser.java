package com.softtek.medicine.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name = "RemedyUserBasic", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class RemedyUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -809687386079985382L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Size(min = 1, max = 25)
	@NotEmpty(message = "Name cannot be empty")
	private String name;

	@NotNull
	@NotEmpty(message = "Password cannot be empty")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
