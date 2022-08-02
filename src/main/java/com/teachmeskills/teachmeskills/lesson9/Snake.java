package com.teachmeskills.teachmeskills.lesson9;

public class Snake extends Animal
{
   private int length;

   public Snake(int age, String name, int length)
   {
      super(age, name);
      this.length = length;
   }

   public int getLength()
   {
      return length;
   }

   public void setLength(int length)
   {
      this.length = length;
   }

   @Override
   public String toString()
   {
      return "Snake{" +
               "length=" + length +
               ", name=" + getName() +
               ", age+" + getAge() +
               '}';
   }
}
