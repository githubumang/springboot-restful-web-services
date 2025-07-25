package com.in28minutes.rest.webservices.restful_web_services.versioning;

public class PersonV2 {
    private String firstName;
    private String secondName;

    public PersonV2(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "PersonV2 [firstName=" + firstName + ", secondName=" + secondName + "]";
    }

}
