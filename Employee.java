package com.example.pto_processor;

public class Employee{
    String name;
    String jobTitle;
    int urgency;
    int PTOHours;
    Company company;
    /*
    urgency = 1 - Must be taken off for religious reasons or emergencies
    urgency = 0 - Not taken off
     */
    String shift; // Develop option to add shifts as a function

    public Employee(String name, String jobTitle, int urgency, String shift){
        this.name = name;
        this.jobTitle = jobTitle;
        this.urgency = urgency;
        this.shift = shift;
        this.PTOHours = company.getStandardPTODays();

    }
}