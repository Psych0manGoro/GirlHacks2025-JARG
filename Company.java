package com.example.pto_processor;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Company{

    private int standardPTODays;

    public Company(String username, String password, int standardPTODays){
        try{
            File dataFile = new File("EmployeeData.txt");
            if(dataFile.createNewFile()){
                FileWriter writer = new FileWriter("EmployeeData.txt");
                writer.write("Username: " + username + "\n");
                writer.write("Password: " + password + "\n");
                writer.write("Standard Days Off:" + standardPTODays + "\n");
            }else{
                Scanner reader = new Scanner(dataFile);
                String storedUsername = reader.nextLine();
                String storedPassword = reader.nextLine();
                if(!username.equals(storedUsername) || !password.equals(storedPassword)){
                    ; // Add some implementation to prompt user that login failed
                }else{
                    ; // Add some implementation to tell front-end that username and
                    // Password matches, and to bring user to home page.
                }
            }
        }
        catch(Exception e){
            throw new IllegalArgumentException("File Could not be Opened");
        }
    }

    static class Employee{
        String name;
        int daysLeft;
        Date[] daysOff;
    }

    public void add_employee(Employee e){
        try (FileWriter writer = new FileWriter("EmployeeData.txt", true)) {
            writer.write("Name: " + e.name + "Days Left: " + e.daysLeft);
            for(Date d : e.daysOff){
                writer.write(d.toString() + ", ");
            }
            writer.write("\n");

        } catch (Exception e1) {
            System.out.println("An error occurred.");
        }
    }

    public int getDaysLeft(String name) {
        try {
            File dataFile = new File("EmployeeData.txt");
            Scanner reader = new Scanner(dataFile);
            reader.nextLine();
            reader.nextLine();
            reader.nextLine();
            while (reader.hasNextLine()) {
                String employee = reader.nextLine();
                int counter = -1;
                for (char c : employee.toCharArray()) {
                    if (c == ',') {
                        break;
                    } else {
                        counter++;
                    }
                }
                return Integer.parseInt(employee.substring(5, counter));
            }
        } catch (Exception e) {
            System.out.println("you got errored");
        }
        return 0;
    }
}



