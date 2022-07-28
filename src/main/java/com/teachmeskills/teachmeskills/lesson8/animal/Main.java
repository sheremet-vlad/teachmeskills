package com.teachmeskills.teachmeskills.lesson8.animal;

public class Main
{
   public static void main(String[] args)
   {
      Animal[] animals = {new Snake(), new Dog(), new Cat()};

      for (Animal animal : animals)
      {
         animal.sound();
      }
   }
}
