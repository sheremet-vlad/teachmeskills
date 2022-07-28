package com.teachmeskills.teachmeskills.lesson8.figure;

public class Circle extends Figure
{
   private int radius;

   @Override
   public void draw()
   {
      System.out.println("circle with" + radius + getColor());
   }

   public int getRadius()
   {
      return radius;
   }

   public void setRadius(int radius)
   {
      this.radius = radius;
   }
}
