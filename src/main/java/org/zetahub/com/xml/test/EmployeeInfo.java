package org.zetahub.com.xml.test;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="employee")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeInfo  implements Serializable{
	
	@XmlElement
	@JsonProperty(value="eid")
	private int id;
	
	
	//@JsonIgnore
	@XmlElement(name="name")
	private String empName;
	
	@XmlElement(name="address")
	private Address address;
	
	@XmlElement
	private String officeLocation;
	
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	 
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	 
	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	} 

}
