package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterId;
	private Date StartDate;
	private Date EndDate;
	public Semester(Date startDate, Date endDate) {
		super();
		setSemesterId();
		setStartDate(startDate);
		setEndDate(endDate);
	}
	public UUID getSemesterId() {
		return SemesterId;
	}
	public void setSemesterId() {
		SemesterId = UUID.randomUUID();
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

}
