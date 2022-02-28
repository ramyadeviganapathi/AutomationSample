package org.userdefinedlistsetmap;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedSet extends UserDefinedEmployeeProgram{

	public static void main(String[] args) {
		
		UserDefinedSet s = new UserDefinedSet();
		s.setEmpId(6607);
		s.setName("Booma");
		s.setPhone(123456789l);
		s.setAddress("Chennai");
		s.setDob("May 9");
		s.setDoj("Dec 2016");
		s.seteMail("boomas@gmail.com");
		s.setGender("Female");
		s.setSal(56788.98f);
		
		UserDefinedSet s1 = new UserDefinedSet();
		s1.setEmpId(1234);
		s1.setName("Arthi");
		s1.setPhone(12345677654l);
		s1.setAddress("Trichy");
		s1.setDob("Jul 12");
		s1.setDoj("Jan 2016");
		s1.seteMail("arthis@gmail.com");
		s1.setGender("Female");
		s1.setSal(45568.98f);
		
		//User Defined Set
		
		Set<UserDefinedSet> st = new LinkedHashSet<UserDefinedSet>();
		st.add(s);
		st.add(s1);
		
		for (UserDefinedSet details : st)
		{
			System.out.println("Emp ID : " +details.getEmpId());
			System.out.println("Emp Name : " +details.getName());
			System.out.println("Emp Ph num : "+details.getPhone());
			System.out.println("Emp Address : " +details.getAddress());
			System.out.println("Emp DOB : " +details.getDob());
			System.out.println("Emp DOJ : " +details.getDoj());
			System.out.println("Emp Email-ID : " +details.geteMail());
			System.out.println("Emp Gender : " +details.getGender());
			System.out.println("Emp Salary : " +details.getSal());
		}
		
		}
	}
	
	

