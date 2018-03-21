package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
				
	}
	
	@Test
	public void test() throws PersonException {
		ArrayList<Staff> list = new ArrayList<Staff>(); 
		Staff A = new Staff("John", "Billy", "Bob", new Date(1999,2,13), "123 Street Rd", "909-999-0990", "thisisn'treal@nah.com", "10-12",5,10,new Date(2018,1,1), eTitle.MR);
		Staff B = new Staff("John", "Billy", "Bob", new Date(1999,2,13), "123 Street Rd", "909-999-0990", "thisisn'treal@nah.com", "10-12",5,11,new Date(2018,1,1), eTitle.MR);
		Staff C = new Staff("John", "Billy", "Bob", new Date(1999,2,13), "123 Street Rd", "909-999-0990", "thisisn'treal@nah.com", "10-12",5,12,new Date(2018,1,1), eTitle.MR);
		Staff D = new Staff("John", "Billy", "Bob", new Date(1999,2,13), "123 Street Rd", "909-999-0990", "thisisn'treal@nah.com", "10-12",5,13,new Date(2018,1,1), eTitle.MR);
		Staff E = new Staff("John", "Billy", "Bob", new Date(1999,2,13), "123 Street Rd", "909-999-0990", "thisisn'treal@nah.com", "10-12",5,14,new Date(2018,1,1), eTitle.MR);
		list.add(A);
		list.add(B);
		list.add(C);
		list.add(D);
		list.add(E);
		double sum = 0;
		for (Staff i: list) {
			sum += i.getSalary();
		}
		double averageSalary = sum/(list.size());
		int average = (int)averageSalary;
		assertEquals(12,average);

	}
	@SuppressWarnings("deprecation")
	@Test
	public void test2() throws PersonException {
		new Staff("John", "Billy", "Bob", new Date(10,2,13), "123 Street Rd", "909-999-0990", "thisisn'treal@nah.com", "10-12",5,10,new Date(2018,1,1), eTitle.MR);
	}
	@Test
	public void test3() throws PersonException {
		new Staff("John", "Billy", "Bob", new Date(1999,2,13), "123 Street Rd", "1", "thisisn'treal@nah.com", "10-12",5,10,new Date(2018,1,1), eTitle.MR);
	}

}
