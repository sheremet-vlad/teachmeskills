package com.teachmeskills.teachmeskills.lesson9.animals;

public class Main
{
   public static void main(String[] args)
   {
      Dog animal = new Dog();

      animal.dogsCount = 10;

      Dog animal2 = new Dog();

      Dog.dogsCount = 30;

      System.out.println(animal);
      System.out.println(animal2);
   }
}
