package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student();
        Abs_Student a = new Student() ;

        s.getAllName();
        s.getAllAge();
        s.getMarks();
        s.getPercentage();
        System.out.println("Hello world!");
    }
}