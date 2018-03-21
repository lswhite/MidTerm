package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.*;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;
		public Course(String courseName, int gradePoints, eMajor eMajor) {
		super();
		setCourseID();
		setCourseName(courseName);
		setGradePoints(gradePoints);
		this.seteMajor(eMajor);
	}
		public UUID getCourseID() {
			return CourseID;
		}
		public void setCourseID() {
			CourseID = UUID.randomUUID();
		}
		public String getCourseName() {
			return CourseName;
		}
		public void setCourseName(String courseName) {
			CourseName = courseName;
		}
		public int getGradePoints() {
			return GradePoints;
		}
		public void setGradePoints(int gradePoints) {
			GradePoints = gradePoints;
		}
		public eMajor geteMajor() {
			return eMajor;
		}
		public void seteMajor(eMajor eMajor) {
			this.eMajor = eMajor;
		}
}
