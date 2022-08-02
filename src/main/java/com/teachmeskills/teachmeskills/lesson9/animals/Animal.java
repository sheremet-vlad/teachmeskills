package com.teachmeskills.teachmeskills.lesson9.animals;

public abstract class Animal implements Breathable
{
   abstract void voice();

   public void jump()
   {
      System.out.println("прыгаю");
   }
}
