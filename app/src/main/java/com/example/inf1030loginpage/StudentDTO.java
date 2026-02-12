package com.example.inf1030loginpage;

public class StudentDTO {
    String firstName;
    String lastName;
    String cp;
    public StudentDTO ( String firstName, String lastName, String cp ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cp = cp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCp() {
        return cp;
    }
}
