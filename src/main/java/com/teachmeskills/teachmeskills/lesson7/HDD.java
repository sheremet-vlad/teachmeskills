package com.teachmeskills.teachmeskills.lesson7;

public class HDD
{
   private int size;

   public HDD(int size)
   {
      this.size = size;
   }

   public int getSize()
   {
      return size;
   }

   public void setSize(int size)
   {
      this.size = size;
   }

   @Override
   public String toString()
   {
      return "HDD{" +
               "size=" + size +
               '}';
   }
}
