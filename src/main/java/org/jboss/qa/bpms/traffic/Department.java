package org.jboss.qa.bpms.traffic;

import java.util.HashMap;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Department implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String country;
	private java.lang.String code;

	public java.util.Map<java.lang.String,java.lang.String> title;

	public Department() {
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public java.lang.String getCode() {
		return this.code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}


	public java.util.Map<String, String> getTitle() {
		return title;
	}

	public void setTitle(java.util.Map<String, String> title) {
		this.title = title;
	}

	public Department(String country, String code, java.util.Map<String, String> title) {
		this.country = country;
		this.code = code;
		this.title = title;
	}
}