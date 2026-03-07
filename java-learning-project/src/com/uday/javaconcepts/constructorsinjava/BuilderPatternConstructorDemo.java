package com.uday.javaconcepts.constructorsinjava;

public class BuilderPatternConstructorDemo {

    /*
    ==========================================================
    Class Fields (Object Properties)
    ==========================================================
    */

    private String userName;
    private String emailAddress;
    private int userAge;
    private String cityName;
    private String phoneNumber;

    /*
    ==========================================================
    Private Constructor
    ==========================================================

    Important Details:
    - Constructor is private.
    - Prevents direct object creation using 'new'.
    - Object must be created using the Builder class.
    */

    private BuilderPatternConstructorDemo(UserProfileBuilder builderObject) {

        this.userName = builderObject.userName;
        this.emailAddress = builderObject.emailAddress;
        this.userAge = builderObject.userAge;
        this.cityName = builderObject.cityName;
        this.phoneNumber = builderObject.phoneNumber;
    }

    /*
    ==========================================================
    Static Builder Class
    ==========================================================

    Important Details:
    - Static inner class used to construct the object.
    - Each method returns the builder object itself.
    - This enables Method Chaining.
    */

    public static class UserProfileBuilder {

        private String userName;
        private String emailAddress;
        private int userAge;
        private String cityName;
        private String phoneNumber;

        public UserProfileBuilder setUserName(String userNameParameter) {
            this.userName = userNameParameter;
            return this;
        }

        public UserProfileBuilder setEmailAddress(String emailAddressParameter) {
            this.emailAddress = emailAddressParameter;
            return this;
        }

        public UserProfileBuilder setUserAge(int userAgeParameter) {
            this.userAge = userAgeParameter;
            return this;
        }

        public UserProfileBuilder setCityName(String cityNameParameter) {
            this.cityName = cityNameParameter;
            return this;
        }

        public UserProfileBuilder setPhoneNumber(String phoneNumberParameter) {
            this.phoneNumber = phoneNumberParameter;
            return this;
        }

        /*
        ==========================================================
        Build Method
        ==========================================================

        Important Details:
        - This method finally creates the object.
        - Calls the private constructor.
        */

        public BuilderPatternConstructorDemo build() {
            return new BuilderPatternConstructorDemo(this);
        }
    }

    /*
    Method to display user information
    */

    public void displayUserProfile() {

        System.out.println("User Name: " + userName);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("User Age: " + userAge);
        System.out.println("City Name: " + cityName);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {

        /*
        ==========================================================
        Creating Object Using Builder Pattern
        ==========================================================
        */

        BuilderPatternConstructorDemo userProfileObject =
                new BuilderPatternConstructorDemo.UserProfileBuilder()
                        .setUserName("Uday Kadam")
                        .setEmailAddress("uday@email.com")
                        .setUserAge(28)
                        .setCityName("Pune")
                        .setPhoneNumber("9876543210")
                        .build();

        userProfileObject.displayUserProfile();

        /*
        Expected Output:

        User Name: Uday Kadam
        Email Address: uday@email.com
        User Age: 28
        City Name: Pune
        Phone Number: 9876543210
        */

    }
}