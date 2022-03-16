package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int idNum){
        this.studentId = idNum;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGradeLevel() {
        if(this.numberOfCredits >= 0 && this.numberOfCredits <= 29){
            return this.name + "is a Freshman";
        } else if(this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
            return this.name + "is a Sophmore";
        } else if(this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            return this.name + "is a Junior";
        } else {
            return this.name + "is a Senior";
        }
    }

    public String addGrade(int creditHours, double grade) {
        double totalQualityScore = this.gpa*this.numberOfCredits;

        totalQualityScore += grade*creditHours;
        this.numberOfCredits += creditHours;

        this.gpa = totalQualityScore/numberOfCredits;

        return "Cumulative gpa is " + this.gpa + "after" + this.numberOfCredits + " credit hours";
    }


    public String toString() {
        return this.name + "(ID: "+this.studentId+ " GPA: "+this.gpa+") "+ this.getGradeLevel();
    }

    public boolean equals(Object studentToCheck) {
        if(this == studentToCheck){
            return true;
        }
        if(studentToCheck == null){
            return false;
        }

        if(!(studentToCheck instanceof Student)){
            return false;
        }

        Student theStudent = (Student)studentToCheck;

        return this.name.equals(theStudent.name) && this.studentId == theStudent.studentId;

    }
}