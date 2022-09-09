package com.teachmeskills.teachmeskills.lesson19;

public class CustomRunnable implements Runnable
{
   private int threadNumber;

   public CustomRunnable(int threadNumber)
   {
      this.threadNumber = threadNumber;
   }

   @Override
   public void run()
   {
      System.out.println(getName());
   }

   private String getName()
   {
      return "custom runnable number: " + threadNumber;
   }
}
