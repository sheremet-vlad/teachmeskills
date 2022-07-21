package com.teachmeskills.teachmeskills.lesson6.entity;

import java.util.Arrays;

public class School
{
   private Student[] students;
   private String address;
   private String number;

   public School(String number, String address)
   {
      System.out.println("constructor");
      this.number = number;
      this.address = address;
   }

   public void initStudents()
   {
      students = new Student[] { new Student() };
   }


   {
      System.out.println("block 1");
      students = new Student[] {new Student(), new Student()};
   }

   {
      System.out.println("block 2");
   }

   static {
      System.out.println("static");
   }

   static {
      System.out.println("static");
   }



   public Student[] getStudents()
   {
      return students;
   }

   public void setStudents(Student[] students)
   {
      this.students = students;
   }

   public String getAddress()
   {
      return address;
   }

   public void setAddress(String address)
   {
      this.address = address;
   }

   public String getNumber()
   {
      return number;
   }

   public void setNumber(String number)
   {
      this.number = number;
   }

   @Override
   public String toString()
   {
      return "School{" +
               "students=" + Arrays.toString(students) +
               ", address='" + address + '\'' +
               ", number='" + number + '\'' +
               '}';
   }
}
