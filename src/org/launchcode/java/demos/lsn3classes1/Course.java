package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String name;
    private ArrayList<Student> students;
    private String instructorName;
    private String semesterOffered;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getSemesterOffered() {
        return semesterOffered;
    }

    public void setSemesterOffered(String semesterOffered) {
        this.semesterOffered = semesterOffered;
    }

    public void setName(String name) {this.name = name;}

    public String getName() {
        return semesterOffered;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return instructorName.equals(course.instructorName) && semesterOffered.equals(course.semesterOffered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructorName, semesterOffered);
    }
}
