package com.teachmeskills.teachmeskills.lesson9.animals;

public final class AnimalUtils
{
   private AnimalUtils()
   {

   }

   public static String formatAnimalName(final Dog dog)
   {
      return dog.getName() + ".";
   }
}
