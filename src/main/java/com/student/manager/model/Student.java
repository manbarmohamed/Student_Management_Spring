package com.student.manager.model;

public class Student {

    private int id_Student;
    private String first_name;
    private String last_name;
    private String email;
    private String status;

    public Student(String first_name, String last_name, String email, String status) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.status = status;
    }

    public Student(int id_Student, String first_name, String last_name, String email, String status) {
        this.id_Student = id_Student;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.status = status;
    }

    public Student() {
    }

    public int getId_Student() {
        return id_Student;
    }

    public void setId_Student(int id_Student) {
        this.id_Student = id_Student;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_Student=" + id_Student +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
