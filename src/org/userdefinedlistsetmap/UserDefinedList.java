package org.userdefinedlistsetmap;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedList extends UserDefinedEmployeeProgram {

	public static void main(String[] args) {
		
		UserDefinedList u = new UserDefinedList();
		u.setEmpId(6607);
		u.setName("Booma");
		u.setPhone(123456789l);
		u.setAddress("Chennai");
		u.setDob("May 9");
		u.setDoj("Dec 2016");
		u.seteMail("boomas@gmail.com");
		u.setGender("Female");
		u.setSal(56788.98f);
		
		UserDefinedList u1 = new UserDefinedList();
		u1.setEmpId(1234);
		u1.setName("Arthi");
		u1.setPhone(12345677654l);
		u1.setAddress("Trichy");
		u1.setDob("Jul 12");
		u1.setDoj("Jan 2016");
		u1.seteMail("arthis@gmail.com");
		u1.setGender("Female");
		u1.setSal(45568.98f);
		
		//User Defined List
		
		List<UserDefinedList> li= new ArrayList<UserDefinedList>();
		li.add(u);
		li.add(u1);
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println("Emp ID : " +li.get(i).getEmpId());
			System.out.println("Emp Name : " +li.get(i).getName());
			System.out.println("Emp Ph num : " +li.get(i).getPhone());
			System.out.println("Emp Address : " +li.get(i).getAddress());
			System.out.println("Emp DOB : " +li.get(i).getDob());
			System.out.println("Emp DOJ : " +li.get(i).getDoj());
			System.out.println("Emp Email-ID : " +li.get(i).geteMail());
			System.out.println("Emp Gender : " +li.get(i).getGender());
			System.out.println("Emp Salary : " +li.get(i).getSal());
		}
	}
}
