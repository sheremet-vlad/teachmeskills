package com.teachmeskills.teachmeskills.lesson7.animal;

public interface Breathable
{
   void breathInAir();

   default void breathInWater() {
      System.out.println("не могу");
   }
}
