package org.userdefinedlistsetmap;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedSetStud extends UserDefinedStudentProgram{

	public static void main(String[] args) {
		
		UserDefinedSetStud s = new UserDefinedSetStud();
		
		s.setStdId(1234);
		s.setStdName("Apar");
		s.setStdPhone(1234567l);
		s.setAddress("Chennai");
		s.setDob("Jan 1");
		s.seteMail("apar@yahoo.com");
		s.setGender("Female");
		
		UserDefinedSetStud s1 = new UserDefinedSetStud();
		s1.setStdId(111);
		s1.setStdName("Krishnav");
		s1.setStdPhone(12345678907l);
		s1.setAddress("Madurai");
		s1.setDob("Aug 12");
		s1.seteMail("Krishnav@gmail.com");
		s1.setGender("Male");
				
		//User Defined Set
		
		Set<UserDefinedSetStud> st = new LinkedHashSet<UserDefinedSetStud>();
		st.add(s);
		st.add(s1);
		
		for (UserDefinedSetStud details : st) {
			System.out.println("Student ID : " +details.getStdId());
			System.out.println("Student Name : " +details.getStdName());
			System.out.println("Student Ph num : "+details.getStdPhone());
			System.out.println("Student Address : " +details.getAddress());
			System.out.println("Student DOB : " +details.getDob());
			System.out.println("Student Email-ID : " +details.geteMail());
			System.out.println("Student Gender : " +details.getGender());
		}
	}
}
