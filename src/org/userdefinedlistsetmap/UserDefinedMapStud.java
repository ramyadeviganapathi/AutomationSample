package org.userdefinedlistsetmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMapStud extends UserDefinedStudentProgram{

	public static void main(String[] args) {
		
		UserDefinedMapStud m = new UserDefinedMapStud();
		
		m.setStdId(1234);
		m.setStdName("Apar");
		m.setStdPhone(1234567l);
		m.setAddress("Chennai");
		m.setDob("Jan 1");
		m.seteMail("apar@yahoo.com");
		m.setGender("Female");
		
		UserDefinedMapStud m1 = new UserDefinedMapStud();
		m1.setStdId(111);
		m1.setStdName("Krishnav");
		m1.setStdPhone(12345678907l);
		m1.setAddress("Madurai");
		m1.setDob("Aug 12");
		m1.seteMail("Krishnav@gmail.com");
		m1.setGender("Male");
		
		///User Defined Map
		
				Map<String, UserDefinedMapStud> mp = new HashMap<String, UserDefinedMapStud>(); 
				mp.put("Student 1", m);
				mp.put("Student 2", m1);
				
				Set<Entry<String, UserDefinedMapStud>> entrySet = mp.entrySet();
				for (Entry<String, UserDefinedMapStud> en : entrySet) {
					
					System.out.println("Key : " +en.getKey());
					System.out.println("Student ID : " +en.getValue().getStdId());
					System.out.println("Student Name : " +en.getValue().getStdName());
					System.out.println("Student Phone : " +en.getValue().getStdPhone());
					System.out.println("Student Address : " +en.getValue().getAddress());
					System.out.println("Student DOB : " +en.getValue().getDob());
					System.out.println("Student Email-ID : " +en.getValue().geteMail());
					System.out.println("Student Gender : " +en.getValue().getGender());
				}
		
	}
}
