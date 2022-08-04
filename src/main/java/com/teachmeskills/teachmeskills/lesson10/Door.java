package com.teachmeskills.teachmeskills.lesson10;

public class Door implements Cloneable
{
   private String color;
   private int weight;

   public Door(String color, int weight)
   {
      this.color = color;
      this.weight = weight;
   }

   public String getColor()
   {
      return color;
   }

   public void setColor(String color)
   {
      this.color = color;
   }

   public int getWeight()
   {
      return weight;
   }

   public void setWeight(int weight)
   {
      this.weight = weight;
   }

   @Override
   public String toString()
   {
      return "Door{" +
               "color='" + color + '\'' +
               ", weight=" + weight +
               '}';
   }
}
