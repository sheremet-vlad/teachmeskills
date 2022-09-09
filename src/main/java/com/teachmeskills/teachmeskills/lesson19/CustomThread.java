package com.teachmeskills.teachmeskills.lesson19;

public class CustomThread extends Thread
{
   @Override
   public void run()
   {
      printThreadInfo(this);
   }

   private static synchronized void printThreadInfo(Thread thread)
   {
      System.out.println("------------------------------------------------------");
      System.out.println(1);
      System.out.println(2);
      System.out.println(3);
      System.out.println(4);
      System.out.println("------------------------------------------------------");
   }
}
