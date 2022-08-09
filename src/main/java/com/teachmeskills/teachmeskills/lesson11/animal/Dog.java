package com.teachmeskills.teachmeskills.lesson11.animal;

public class Dog implements Breathable, Runnable
{
   @Override
   public void breath()
   {
      System.out.println("breath");
   }

   @Override
   public void run()
   {
      System.out.println("run");
   }
}
