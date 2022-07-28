package com.teachmeskills.teachmeskills.lesson8.figure;

public class FigureService
{
   public void draw(final Figure figure)
   {
      if (figure instanceof Circle)
      {
         Circle circle = (Circle) figure;
         circle.getRadius();
         circle.getColor();
      }
   }
}
