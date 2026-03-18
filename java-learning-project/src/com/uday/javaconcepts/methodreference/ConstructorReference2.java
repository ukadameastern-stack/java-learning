package com.uday.javaconcepts.methodreference;

@FunctionalInterface
interface GetTeacherInstance {
    Teacher getTeacher(int id, String name);
}

class Teacher {
    int id;
    String name;

    public Teacher(int id) {
        System.out.println("Teacher 1");
        this.id = id;
    }

    public Teacher(int i, String s) {
        System.out.println("Teacher 2");
        this.id = i;
    }
}

public class ConstructorReference2 {

    public static void main(String[] args) {

        //GetTeacherInstance teacherInstance = (id, uday) -> new Teacher(id);
        GetTeacherInstance teacherInstance = Teacher::new;

        System.out.println(teacherInstance.getTeacher(1, "Uday"));
        System.out.println(teacherInstance.getTeacher(2, "Amol"));
    }
}