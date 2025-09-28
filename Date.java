package com.example.pto_processor;


public class Date {
    int year;
    int month;
    int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        else if(other.getClass() != this.getClass()){
            return false;
        }

        else{
            return this.year == other.year && this.month == other.month && this.day == other.day;
        }
    }

    public String

    // add to string method
}
