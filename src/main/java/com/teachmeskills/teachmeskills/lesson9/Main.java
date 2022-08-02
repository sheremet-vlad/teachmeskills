package com.teachmeskills.teachmeskills.lesson9;

import java.util.Arrays;

public class Main
{
   private static final double PI = 3.14;

   public static void main(String[] args)
   {
      Animal animal = new Animal(10, "animal 1");

      Animal snake = new Snake(15, "snake 1", 5);

      //System.out.println(animal);
      //System.out.println(snake);

      printMessages("message 1", "message 2", "message 3");

      Main main = new Main();

      main.test(new B(), new B());
      //main.test(105, 30);*/
   }

   public double calculateCircleSquare(final int radius)
   {
      return PI * radius * radius;
   }

   public void test(A a, A b)
   {
      System.out.println(a.toString() + b.toString());
   }

   public void test(B... a)
   {
      System.out.println(a);
   }

   public void test(C a, B b)
   {
      System.out.println("int, long");
      System.out.println(a.toString() + b.toString());
   }



   public static void printMessages(final String... messages)
   {
      for (String message : messages)
      {
         System.out.println(message);
      }
   }

}

class A {

}

class B extends A {

}

class C extends B {

}
