package com.teachmeskills.teachmeskills.lesson3;

import java.util.Scanner;

public class Main
{
   public static void main(String[] args) throws InterruptedException
   {
     /* START_AGAIN:
      while (true) {
         Scanner scanner = new Scanner(System.in);
         String value = scanner.nextLine();

         if (value.equals("exit"))
         {
            break START_AGAIN;
         }
         else
         {
            System.out.println("command: " + value);
         }
      }
      System.out.println("");*/
      MathUtils mathUtils = new MathUtils();
      //mathUtils.printEvenNumbersViaFor(10);
      mathUtils.printEvenNumbersViaFor(10);
      /*Student vlad = new Student(0);
      HomeworkExecutor homeworkExecutor = new HomeworkExecutor();
      Homework homework = new Homework("сегодня", "большая", "математика");

      homeworkExecutor.doHomework(vlad, homework);

      System.out.println("Программа закончена");*/
   }
}
