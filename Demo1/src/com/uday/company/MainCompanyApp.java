package com.uday.company;

public class MainCompanyApp {
    public static void main(String[] args) {

        // Access static variables
        System.out.println(CompanyMaster.companyName);
        System.out.println(CompanyMaster.employeeCount);

        // Access static method
        CompanyMaster.displayCompany();
    }
}
