package com.uday.javaconcepts.thissuper;

/*
 Main class to run the program
*/
public class MainApp {

    public static void main(String[] args) {

        /*
            Parent Constructor Called
            Child Constructor Called
         */
        Child obj = new Child();

        /*
            Child number using this: 200
            Parent number using super: 100
         */
        obj.showNumbers();

        /*
            Child display() method
            Parent display() method
         */
        obj.display();
    }
}

/*
o/p:

Parent Constructor Called
Child Constructor Called
Child number using this: 200
Parent number using super: 100
Child display() method
Parent display() method

 */