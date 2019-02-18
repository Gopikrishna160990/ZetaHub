package org.zetahub.com.xml.test;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Address implements Serializable{

	@XmlElement(name="hno")
	private String hno;

	@XmlElement(name="state")
	private String state;

	@XmlElement(name="city")
	private String city;
	 
	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}
	 
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	 
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
