package org.userdefinedlistsetmap;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedListStud extends UserDefinedStudentProgram{

	public static void main(String[] args) {
		
		UserDefinedListStud u = new UserDefinedListStud();
		
		u.setStdId(1234);
		u.setStdName("Apar");
		u.setStdPhone(1234567l);
		u.setAddress("Chennai");
		u.setDob("Jan 1");
		u.seteMail("apar@yahoo.com");
		u.setGender("Female");
		
		UserDefinedListStud u1 = new UserDefinedListStud();
		u1.setStdId(111);
		u1.setStdName("Krishnav");
		u1.setStdPhone(12345678907l);
		u1.setAddress("Madurai");
		u1.setDob("Aug 12");
		u1.seteMail("Krishnav@gmail.com");
		u1.setGender("Male");
		
		//User Defined List
		
				List<UserDefinedListStud> li= new ArrayList<UserDefinedListStud>();
				li.add(u);
				li.add(u1);
				
				for (int i = 0; i < li.size(); i++) {
					System.out.println("Student ID : " +li.get(i).getStdId());
					System.out.println("Student Name : " +li.get(i).getStdName());
					System.out.println("Student Phone : " +li.get(i).getStdPhone());
					System.out.println("Student Address : " +li.get(i).getAddress());
					System.out.println("Student Dob : " +li.get(i).getDob());
					System.out.println("Student Email-ID : " +li.get(i).geteMail());
					System.out.println("Student Gender : " +li.get(i).getGender());
				}
	}
}
