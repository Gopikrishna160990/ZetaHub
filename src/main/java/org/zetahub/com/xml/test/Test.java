package org.zetahub.com.xml.test;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	public static void main(String[] args) {
		try {
			String xml = "<employee><id>123</id><name>Gopii</name>"
					+ "<address>"
					+ "<hno>111111</hno>"
					+ "<state>HYD</state>"
					+ "<city>HYD</city>"
					+ "</address>"
					+ "<officeLocation>MADHAPUR</officeLocation>"
					+ "</employee>";
			
			
			EmployeeInfo  product= new EmployeeInfo();
			JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeInfo.class);
			Unmarshaller  marshaller = jaxbContext.createUnmarshaller();
			
			StringReader reader = new StringReader(xml);
			EmployeeInfo car = (EmployeeInfo) marshaller.unmarshal(reader);
			//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//marshaller.marshal(product,xml);
			//marshaller.marshal(product,new File("C://Users//Admin//git//ZetaHub//src//main//resources//employee.xml"));
			//marshaller.marshal(product, System.out);
			
			System.out.println(new ObjectMapper().writeValueAsString(car));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
