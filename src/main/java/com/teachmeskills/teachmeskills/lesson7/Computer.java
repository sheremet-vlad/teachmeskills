package com.teachmeskills.teachmeskills.lesson7;

public class Computer
{
   private String name;
   private HDD hdd;

   public Computer()
   {

   }

   public Computer(String name, HDD hdd)
   {
      this.name = name;
      this.hdd = hdd;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public HDD getHdd()
   {
      return hdd;
   }

   public void setHdd(HDD hdd)
   {
      this.hdd = hdd;
   }

   @Override
   public String toString()
   {
      return "Computer{" +
               "name='" + name + '\'' +
               ", hdd=" + hdd +
               '}';
   }
}
