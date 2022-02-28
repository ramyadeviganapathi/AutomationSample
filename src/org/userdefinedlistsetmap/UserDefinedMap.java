package org.userdefinedlistsetmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMap extends UserDefinedEmployeeProgram{

	public static void main(String[] args) {
		
		UserDefinedMap m = new UserDefinedMap();
		
		m.setEmpId(6607);
		m.setName("Booma");
		m.setPhone(123456789l);
		m.setAddress("Chennai");
		m.setDob("May 9");
		m.setDoj("Dec 2016");
		m.seteMail("boomas@gmail.com");
		m.setGender("Female");
		m.setSal(56788.98f);
		
		UserDefinedMap m1 = new UserDefinedMap();
		m1.setEmpId(1234);
		m1.setName("Arthi");
		m1.setPhone(12345677654l);
		m1.setAddress("Trichy");
		m1.setDob("Jul 12");
		m1.setDoj("Jan 2016");
		m1.seteMail("arthis@gmail.com");
		m1.setGender("Female");
		m1.setSal(45568.98f);
		
		///User Defined Map
		
		Map<String, UserDefinedMap> mp = new HashMap<String, UserDefinedMap>(); 
		mp.put("User1", m);
		mp.put("User2", m1);
		
		Set<Entry<String, UserDefinedMap>> entrySet = mp.entrySet();
		for (Entry<String, UserDefinedMap> en : entrySet) {
			System.out.println("Key : " +en.getKey());
			System.out.println("EMP ID: " +en.getValue().getEmpId());
			System.out.println("EMP Name: " +en.getValue().getName());
			System.out.println("EMP Ph no: " +en.getValue().getPhone());
			System.out.println("EMP Address: " +en.getValue().getAddress());
			System.out.println("EMP DOB: " +en.getValue().getDob());
			System.out.println("EMP DOJ: " +en.getValue().getDoj());
			System.out.println("EMP Email: " +en.getValue().geteMail());
			System.out.println("EMP Gender: " +en.getValue().getGender());
			System.out.println("EMP Salary: " +en.getValue().getSal());
		}
		
	}
}
