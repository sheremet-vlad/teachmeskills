package com.teachmeskills.teachmeskills.lesson9;

import com.teachmeskills.teachmeskills.lesson9.animals.AnimalUtils;
import com.teachmeskills.teachmeskills.lesson9.animals.Dog;

public class AnimalService
{
   public void sayHi(Animal animal)
   {
      String message = formatMessage(animal) + " hi";
      System.out.println(message);
   }

   private String formatMessage(Animal animal)
   {
      return AnimalUtils.formatAnimalName(new Dog()) + " say";
   }
}
