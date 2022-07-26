package com.teachmeskills.teachmeskills.lesson7.animal;

public abstract class Animal
{
   protected String name;
   private int age;

   public abstract void sayMessage();

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public int getAge()
   {
      return age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }
}
