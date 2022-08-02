package com.teachmeskills.teachmeskills.lesson9.animals;

public class Dog extends Animal implements Breathable
{
   public static int dogsCount;
   private String name;

   @Override
   void voice()
   {
      System.out.println("гав");
   }

   @Override
   public void breath()
   {
      name = "name";
      Dog.dogsCount = 10;
      System.out.println("вдох - выдох");
   }

   @Override
   public void jump()
   {
      System.out.println("не прыгаю, лень");
   }

   public static void test()
   {
      System.out.println("test");
   }

   @Override
   public String toString()
   {
      return "Dog{" +
               "name='" + name + '\'' +
               "dogsCount=" + dogsCount +
               '}';
   }

   public static int getDogsCount()
   {
      return dogsCount;
   }

   public static void setDogsCount(int dogsCount)
   {
      Dog.dogsCount = dogsCount;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
}
