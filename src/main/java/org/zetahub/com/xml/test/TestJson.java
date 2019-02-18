package org.zetahub.com.xml.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJson {
	   public static void main(String[] args) throws Exception {
		   
		String json = "{\"eid\":1444,\"empName\":\"ABC\",\"address\":{\"hno\":\"2222\",\"state\":\"hshshdshd\",\"city\":\"iuiuhjkhjhjhj\"},\"officeLocation\":\"HYD\"}";
		EmployeeInfo info = new ObjectMapper().readValue(json, EmployeeInfo.class);
		
		System.out.println(new ObjectMapper().writeValueAsString(info));
		
		EmployeeInfo emplInfo = new EmployeeInfo();
		Address add = new Address();
		emplInfo.setAddress(add);
		
		System.out.println(new ObjectMapper().writeValueAsString(emplInfo));
		
	}
}
