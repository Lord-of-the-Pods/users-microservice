package com.example;

import java.util.ArrayList;

public class CriminalRecord {

    String firstName;

    String lastName;

    boolean firstTimeOffender;

    ArrayList<String> offences;

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

    public boolean isFirstTimeOffender() {
        return firstTimeOffender;
    }

    public void setFirstTimeOffender(boolean firstTimeOffender) {
        this.firstTimeOffender = firstTimeOffender;
    }

    public ArrayList<String> getOffences() {
        return offences;
    }

    public void setOffences(ArrayList<String> offences) {
        this.offences = offences;
    }

}
