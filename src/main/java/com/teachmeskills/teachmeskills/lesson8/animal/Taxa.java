package com.teachmeskills.teachmeskills.lesson8.animal;

public class Taxa extends Dog implements BeLongable
{
   @Override
   public void sound()
   {
      System.out.println("тяв тяв");
   }

   @Override
   public void beLonger()
   {
      System.out.println("стала еще чуть длиннее");
   }
}
