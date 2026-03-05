package com.uday.company;

public class CompanyMaster {

    public static String companyName = "TechCorp";
    public static int employeeCount = 500;

    public static void displayCompany() {
        System.out.println(
                "Company: "
                        + CompanyMaster.companyName  // We can access variable like this
                        + " - Employees: "
                        + employeeCount // or like this, if we are on the same class.
        );
    }
}
