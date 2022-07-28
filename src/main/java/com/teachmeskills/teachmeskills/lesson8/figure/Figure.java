package com.teachmeskills.teachmeskills.lesson8.figure;

public abstract class Figure implements Drawable
{
   private String color;

   public String getColor()
   {
      return color;
   }

   public void setColor(String color)
   {
      this.color = color;
   }
}
