package assignment5;

import java.lang.*;
import java.util.Objects;

public class Student implements Comparable<Student>{
    
    private String name, lastName;
    private double GPA;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student(String name, String lastName, double GPA) {
        this.name = name;
        this.lastName = lastName;
        this.GPA = GPA;

    }


    @Override
    public int compareTo(Student o) {

        int nameDiff = getLastName().compareTo(o.getLastName());
        double gpaDiff = getGPA() - o.getGPA();

        if (nameDiff == 0 && gpaDiff == 0) {

            return 0;
        } else if (gpaDiff < 0) {

            return -1;
        } else {

            return 1;
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        return this.getName().equals(other.getName()) && this.getLastName().equals(other.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName,GPA);
    }
    
    
    
}
