package com.chinmay.StudentCrud.model;

import jakarta.persistence.*;

@Entity
@Table(name="studentAddress")
public class StudentAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String plotNo;
    private String area;
    private String city;
    private String pinCode;
    @OneToOne(mappedBy = "address")
    private Student student;
    public StudentAddress() {

    }

    public StudentAddress(int id, String plotNo, String area, String city, String pinCode, Student student) {
        this.id = id;
        this.plotNo = plotNo;
        this.area = area;
        this.city = city;
        this.pinCode = pinCode;
        //this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "id=" + id +
                ", plotNo='" + plotNo + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", student=" + //student +
                '}';
    }
}
