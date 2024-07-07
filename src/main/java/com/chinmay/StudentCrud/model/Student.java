package com.chinmay.StudentCrud.model;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;

    private String firstName;
    private String lastName;

    private String collageName;

    private String rollNumber;

    private String mobileNumber;

    private String emailId;

    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId", referencedColumnName = "id")
    private StudentAddress address;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String collageName, String rollNumber, String mobileNumber, String emailId, String password, StudentAddress address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.collageName = collageName;
        this.rollNumber = rollNumber;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.password = password;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudentAddress getAddress() {
        return address;
    }

    public void setAddress(StudentAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", collageName='" + collageName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
