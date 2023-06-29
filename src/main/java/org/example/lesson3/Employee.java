package org.example.lesson3;

public class Employee {
    private String m_employeeName;
    private int employeeID;
    private static int employeeCount;
    //protected String title;
    private static final int TOTAL_EMP_UPPER_LIMIT = 100; // final makes it non-modifiable.

    public Employee(String aEmployeeName) {
        this.m_employeeName = aEmployeeName;
        this.employeeID = generateEmployeeID();

        //block
        {

        }
    }

    private int generateEmployeeID() {
        return employeeCount++;
    }

    public String getEmployeeName(){
        return m_employeeName;
    }


    public static int getEmployeeCount(){
        return employeeCount;
    }
}
