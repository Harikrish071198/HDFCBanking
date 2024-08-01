package org.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Implementation {

	public static void main(String[] args) throws IOException {
		
		HDFCDatabase h=new HDFCDatabase();
		
		h.readDataFromTextFile();
		
		h.setCusId("Hari123");
		
		h.setPassword(777);
		
		h.setBalance();
		
		System.out.println(h.getBalance());
		

HDFCDatabase k=new HDFCDatabase();
		
		k.readDataFromTextFile();
		
		k.setCusId("karthi123");
		
		k.setPassword(999);
		
		k.setBalance();
		
		System.out.println(k.getBalance());
		
HDFCDatabase j=new HDFCDatabase();
		
		j.readDataFromTextFile();
		
		j.setCusId("Ajith123");
		
		j.setPassword(888);
		
		j.setBalance();
		
		System.out.println(j.getBalance());
		
		HDFCDatabase l=new HDFCDatabase();
		
			l.readDataFromTextFile();
		
			l.setCusId("deena");
			
			l.setPassword(123);
			
			l.setBalance();
			
			System.out.println(l.getBalance());
			
		//user defined List,Set,Map
		
		//List- Generic- Wrapper class -Similar Datatypes-Wrapper class
		
		//List - Generics- Wrapper class -user defined class - user defined List
		
		List<HDFCDatabase> li= new ArrayList();
		li.add(h);
		 
		li.add(k);
		
		li.add(j);
		
		li.add(l);
		
		System.out.println("=========user defined List=============");
		
		for(int i=0; i<li.size(); i++) {
			HDFCDatabase hdfcDatabase = li.get(i);
			
			System.out.println(hdfcDatabase.getBalance());
		}
		
		//User defined set
		Set<HDFCDatabase> si=new LinkedHashSet();
		
		si.add(h);
		
		si.add(k);
		
		si.add(j);
		
		si.add(l);
		
		System.out.println("=============user defined set==================");
		
		//user defined Set Iteration
		
		for(HDFCDatabase x:si) {
			
			System.out.println(x.getBalance());
		}
		
		//userdefined map
		 
		Map<Integer,HDFCDatabase> m= new LinkedHashMap();
		
		m.put(10, h);
		
		m.put(20, k);
		
		m.put(30, j);
		
		m.put(40, l);
		
		//Iteration of Map
		//Convert the map into Set
		//pair- Entry<key, value>
		
		System.out.println("==============user defined Map============");
		
		Set<Entry<Integer, HDFCDatabase>> entrySet = m.entrySet();
		for(Entry<Integer,HDFCDatabase> e:entrySet) {
			System.out.println(e.getValue().getBalance());
		}
	}
}
