 package org.demo;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class HDFCDatabase {
 
	Map<String, Integer> m;
	
	private String cusId;
	
	private int password;
	
	private int balance;
	
	//setter method
	
	public void setCusId(String cusId) {
		
		if(cusId.equals("Hari123")) {
			
		this.cusId ="Hari cusId";
		
		}
		
		else if(cusId.equals("karthi123")) {
			
		this.cusId="karthi cusId";
		
		}
		 
		else if(cusId.equals("Ajith123")) {
			
			this.cusId="Ajith cusId";
			
		}
		
		else {
			this.cusId="Invalid_Account";
		}
	}
	
	public void setPassword(int password) {
		
		if(password ==777 && cusId.equals("Hari cusId")) {
		
		this.password = 1;
		}
		
		else if(password == 999 && cusId.equals("karthi cusId") ) {
			
			this.password=2;
			
		}
		else if(password == 888 &&cusId.equals("Ajith cusId")) {
			
			this.password=3;
		}
		else {
			this.password=0;
		}
	}
	
	public void setBalance( ) {
		
	
		if(password == 1) {
			
			Integer integer = m.get("Hari Account");
		
		  this.balance = integer;
	}
		
		else if(password == 2){
			
			Integer integer = m.get("karthi Account");
			
			this.balance=integer;
		}
		
		else if(password == 3) {
			
			Integer integer = m.get("Ajith Account");
			
			this.balance=integer;
		}
		else {
			this.balance=0;
		}
	}
	
	//Getter method
	
	public String getCusId() {
		return null;
	}
	
	public int getPassword() {
		return 0;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void readDataFromTextFile() throws IOException {
		
		m=new LinkedHashMap();
		
		File f=new File("C:\\Users\\harik\\eclipse-workspace\\HDFCBanking\\Database\\HDFCDatabase.txt");
		
		List<String> allData = FileUtils.readLines(f);
		
		//all dataData -[Hari123,777,80000,  karthi,999,90000,   Ajith,888,70000]
		
		String string = allData.get(0);//string-[Hari123,777,80000]
		
		String[] s1 = string.split(",");

		String value = s1[2];
		
		//convert String into Integer
		
		
		int parseInt = Integer.parseInt(value);
		
		m.put("Hari Account", parseInt);
		
		String string2 = allData.get(1);
		
		String[] s2 = string2.split(",");
		
		int parseInt2 = Integer.parseInt(s2[2]);
		
	  m.put("karthi Account", parseInt2);
	  
	  String string3 = allData.get(2);
	  
	  String[] s3 = string3.split(",");
	  
	  m.put("Ajith Account",Integer.parseInt(s3[2]) );
	  
	  
		
		
		
		
	}
	
}
