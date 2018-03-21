package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static ArrayList<Course> CourseList = new ArrayList<Course>();
	static ArrayList<Section> SectionList = new ArrayList<Section>();
	static ArrayList<Student> StudentList = new ArrayList<Student>();
	static ArrayList<Enrollment> EnrollmentList = new ArrayList<Enrollment>();
	@BeforeClass
	public static void setup() throws PersonException {
		Course A = new Course("Computer Science 10", 1,eMajor.COMPSI);
		Course B = new Course("English 110", 2, eMajor.NURSING);
		Course C = new Course("Biology 200",3,eMajor.CHEM);
		
		CourseList.add(A);
		CourseList.add(B);
		CourseList.add(C);
		
		Semester Spring = new Semester(new Date(2018,1,1),new Date(2018,5,1));
		Semester Fall = new Semester(new Date(2017,9,1), new Date(2017,12,1));
		ArrayList<Semester> SemesterList = new ArrayList<Semester>();
		SemesterList.add(Fall);
		SemesterList.add(Spring);
		
		Section FA = new Section(A.getCourseID(),Fall.getSemesterId(), 100);
		Section FB = new Section(B.getCourseID(),Fall.getSemesterId(), 101);
		Section FC = new Section(C.getCourseID(),Fall.getSemesterId(), 102);
		Section SA = new Section(A.getCourseID(),Spring.getSemesterId(), 100);
		Section SB = new Section(B.getCourseID(),Spring.getSemesterId(), 101);
		Section SC = new Section(C.getCourseID(),Spring.getSemesterId(), 102);
		
		SectionList.add(SC);
		SectionList.add(SB);
		SectionList.add(SA);
		SectionList.add(FC);
		SectionList.add(FB);
		SectionList.add(FA);
		
		Student S1 = new Student("FirstName", "MiddleName", "LastName", new Date(1999,1,1), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		Student S2 = new Student("Billy", "Bob", "Joe", new Date(1999,5,10), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		Student S3 = new Student("FirstName", "MiddleName", "LastName", new Date(1999,0,1), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		Student S4 = new Student("FirstName", "MiddleName", "LastName", new Date(1999,0,1), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		Student S5 = new Student("FirstName", "MiddleName", "LastName", new Date(1999,0,1), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		Student S6 = new Student("FirstName", "MiddleName", "LastName", new Date(1999,0,1), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		Student S7 = new Student("FirstName", "MiddleName", "LastName", new Date(1999,0,1), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		Student S8 = new Student("FirstName", "MiddleName", "LastName", new Date(1999,0,1), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		Student S9 = new Student("FirstName", "MiddleName", "LastName", new Date(1999,0,1), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		Student S10 = new Student("FirstName", "MiddleName", "LastName", new Date(1999,0,1), eMajor.BUSINESS, "123 Street Pass", "1234567890", "ThisEmail@webpage.com");
		
		StudentList.add(S10);
		StudentList.add(S9);
		StudentList.add(S2);
		StudentList.add(S3);
		StudentList.add(S4);
		StudentList.add(S5);
		StudentList.add(S6);
		StudentList.add(S7);
		StudentList.add(S8);
		StudentList.add(S1);
		
		for (Student i:StudentList) {
			for (Section s:SectionList) {
				EnrollmentList.add(new Enrollment(i.getStudentID(),s.getSectionID()));
			}
		}
		
		for (Enrollment e:EnrollmentList) {
			e.setGrade(90);
		}
		
	}
	
	@Test
	public void Student1Average() {
		
		double S1Average = ((EnrollmentList.get(0).getGrade()+EnrollmentList.get(1).getGrade()+EnrollmentList.get(2).getGrade()+EnrollmentList.get(3).getGrade()
				+EnrollmentList.get(4).getGrade()+EnrollmentList.get(5).getGrade())/6);
		assertEquals(S1Average,90,1);
	}
	
	@Test
	public void Student2Average() {
		double S2Average = ((EnrollmentList.get(6).getGrade()+EnrollmentList.get(7).getGrade()+EnrollmentList.get(8).getGrade()+EnrollmentList.get(9).getGrade()
				+EnrollmentList.get(10).getGrade()+EnrollmentList.get(11).getGrade())/6);
		assertEquals(S2Average,90,1);
	}
	@Test
	public void Student3Average() {
		double S3Average = ((EnrollmentList.get(12).getGrade()+EnrollmentList.get(13).getGrade()+EnrollmentList.get(14).getGrade()+EnrollmentList.get(15).getGrade()
				+EnrollmentList.get(16).getGrade()+EnrollmentList.get(17).getGrade())/6);
		assertEquals(S3Average,90,1);
	}
	@Test
	public void Student4Average() {
		double S4Average = ((EnrollmentList.get(18).getGrade()+EnrollmentList.get(19).getGrade()+EnrollmentList.get(20).getGrade()+EnrollmentList.get(21).getGrade()
				+EnrollmentList.get(22).getGrade()+EnrollmentList.get(23).getGrade())/6);
		assertEquals(S4Average,90,1);
	}
	@Test
	public void Student5Average() {
		double S5Average = ((EnrollmentList.get(24).getGrade()+EnrollmentList.get(25).getGrade()+EnrollmentList.get(26).getGrade()+EnrollmentList.get(27).getGrade()
				+EnrollmentList.get(28).getGrade()+EnrollmentList.get(29).getGrade())/6);
		assertEquals(S5Average,90,1);
	}
	@Test
	public void Student6Average() {
		double S6Average = ((EnrollmentList.get(30).getGrade()+EnrollmentList.get(31).getGrade()+EnrollmentList.get(32).getGrade()+EnrollmentList.get(33).getGrade()
				+EnrollmentList.get(34).getGrade()+EnrollmentList.get(35).getGrade())/6);
		assertEquals(S6Average,90,1);
	}
	@Test
	public void Student7Average() {
		double S7Average = ((EnrollmentList.get(36).getGrade()+EnrollmentList.get(37).getGrade()+EnrollmentList.get(38).getGrade()+EnrollmentList.get(39).getGrade()
				+EnrollmentList.get(40).getGrade()+EnrollmentList.get(41).getGrade())/6);
		assertEquals(S7Average,90,1);
	}
	@Test
	public void Student8Average() {
		double S8Average = ((EnrollmentList.get(42).getGrade()+EnrollmentList.get(43).getGrade()+EnrollmentList.get(44).getGrade()+EnrollmentList.get(45).getGrade()
				+EnrollmentList.get(46).getGrade()+EnrollmentList.get(47).getGrade())/6);
		assertEquals(S8Average,90,1);
	}
	@Test
	public void Student9Average() {
		double S9Average = ((EnrollmentList.get(48).getGrade()+EnrollmentList.get(49).getGrade()+EnrollmentList.get(50).getGrade()+EnrollmentList.get(51).getGrade()
				+EnrollmentList.get(52).getGrade()+EnrollmentList.get(53).getGrade())/6);
		assertEquals(S9Average,90,1);
	}
	@Test
	public void Student10Avgerage() {
		double S10Average = ((EnrollmentList.get(54).getGrade()+EnrollmentList.get(55).getGrade()+EnrollmentList.get(56).getGrade()+EnrollmentList.get(57).getGrade()
				+EnrollmentList.get(58).getGrade()+EnrollmentList.get(59).getGrade())/6);
		assertEquals(S10Average,90,1);
	}
	@Test
	public void Course1Average() {
		double Course1 = ((EnrollmentList.get(0).getGrade()+EnrollmentList.get(6).getGrade()+EnrollmentList.get(12).getGrade()+EnrollmentList.get(18).getGrade()
				+EnrollmentList.get(24).getGrade()+EnrollmentList.get(30).getGrade()+EnrollmentList.get(36).getGrade()+EnrollmentList.get(42).getGrade()+EnrollmentList.get(48).getGrade()+EnrollmentList.get(54).getGrade())/10);
	
	}
	
	@Test
	public void Course2Average() {
		double Course2 = ((EnrollmentList.get(1).getGrade()+EnrollmentList.get(7).getGrade()+EnrollmentList.get(13).getGrade()+EnrollmentList.get(19).getGrade()
				+EnrollmentList.get(25).getGrade()+EnrollmentList.get(31).getGrade()+EnrollmentList.get(37).getGrade()+EnrollmentList.get(43).getGrade()+EnrollmentList.get(49).getGrade()+EnrollmentList.get(55).getGrade())/10);
	
	}
	@Test
	public void Course3Average() {
		double Course3 = ((EnrollmentList.get(2).getGrade()+EnrollmentList.get(8).getGrade()+EnrollmentList.get(14).getGrade()+EnrollmentList.get(20).getGrade()
				+EnrollmentList.get(26).getGrade()+EnrollmentList.get(32).getGrade()+EnrollmentList.get(38).getGrade()+EnrollmentList.get(44).getGrade()+EnrollmentList.get(50).getGrade()+EnrollmentList.get(56).getGrade())/10);
	
	}
	@Test
	public void Course4Average() {
		double Course4 = ((EnrollmentList.get(3).getGrade()+EnrollmentList.get(9).getGrade()+EnrollmentList.get(15).getGrade()+EnrollmentList.get(21).getGrade()
				+EnrollmentList.get(27).getGrade()+EnrollmentList.get(33).getGrade()+EnrollmentList.get(39).getGrade()+EnrollmentList.get(45).getGrade()+EnrollmentList.get(51).getGrade()+EnrollmentList.get(57).getGrade())/10);
	
	}
	@Test
	public void Course5Average() {
		double Course5 = ((EnrollmentList.get(4).getGrade()+EnrollmentList.get(10).getGrade()+EnrollmentList.get(16).getGrade()+EnrollmentList.get(22).getGrade()
				+EnrollmentList.get(28).getGrade()+EnrollmentList.get(34).getGrade()+EnrollmentList.get(40).getGrade()+EnrollmentList.get(46).getGrade()+EnrollmentList.get(52).getGrade()+EnrollmentList.get(58).getGrade())/10);
	
	}
	@Test
	public void Course6Average() {
		double Course6 = ((EnrollmentList.get(5).getGrade()+EnrollmentList.get(11).getGrade()+EnrollmentList.get(17).getGrade()+EnrollmentList.get(23).getGrade()
				+EnrollmentList.get(29).getGrade()+EnrollmentList.get(35).getGrade()+EnrollmentList.get(41).getGrade()+EnrollmentList.get(47).getGrade()+EnrollmentList.get(53).getGrade()+EnrollmentList.get(59).getGrade())/10);
	
		
	}
}