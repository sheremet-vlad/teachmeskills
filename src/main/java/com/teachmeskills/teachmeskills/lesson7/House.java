package com.teachmeskills.teachmeskills.lesson7;

import java.util.Objects;

public class House
{
   private String address;
   private int number;
   private double size;

   public House(String address, int number, double size)
   {
      this.address = address;
      this.number = number;
      this.size = size;
   }

   public String getAddress()
   {
      return address;
   }

   public void setAddress(String address)
   {
      this.address = address;
   }

   public int getNumber()
   {
      return number;
   }

   public void setNumber(int number)
   {
      this.number = number;
   }

   public double getSize()
   {
      return size;
   }

   public void setSize(double size)
   {
      this.size = size;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      House house = (House) o;
      return number == house.number && Double.compare(house.size, size) == 0 &&
               Objects.equals(address, house.address);
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(address, number, size);
   }
}
