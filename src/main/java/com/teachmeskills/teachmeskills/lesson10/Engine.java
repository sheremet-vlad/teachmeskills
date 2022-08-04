package com.teachmeskills.teachmeskills.lesson10;

public class Engine implements Cloneable
{
   private int size;
   private double power;

   public int getSize()
   {
      return size;
   }

   public void setSize(int size)
   {
      this.size = size;
   }

   public double getPower()
   {
      return power;
   }

   public void setPower(double power)
   {
      this.power = power;
   }

   @Override
   public String toString()
   {
      return "Engine{" +
               "size=" + size +
               ", power=" + power +
               '}';
   }
}
