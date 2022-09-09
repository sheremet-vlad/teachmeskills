package com.teachmeskills.teachmeskills.lesson18;

public class Car
{
   private boolean isNew;
   private String brand;

   public boolean isNew()
   {
      return isNew;
   }

   public void setNew(boolean aNew)
   {
      isNew = aNew;
   }

   public String getBrand()
   {
      return brand;
   }

   public void setBrand(String brand)
   {
      this.brand = brand;
   }

   @Override
   public String toString()
   {
      return "Car{" +
               "isNew=" + isNew +
               ", brand='" + brand + '\'' +
               '}';
   }
}
