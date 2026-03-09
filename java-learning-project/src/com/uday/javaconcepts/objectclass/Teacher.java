package com.uday.javaconcepts.objectclass;

public class Teacher {
    int id;
    String name;

    public Teacher() {}

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        // if both references point to same object
        if (this == obj)
            return true;

        // check null and class type
        if (obj == null || getClass() != obj.getClass())
            return false;

        Teacher s = (Teacher) obj;

        return id == s.id && name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}
