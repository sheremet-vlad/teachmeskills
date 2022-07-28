package com.teachmeskills.teachmeskills.lesson8.house;

public class Main
{
   public static void main(String[] args)
   {
      HouseService houseService = new HouseService();

      House house = new House();
      house.setCity("Minsk");
      house.setHouseNumber("10");
      house.setColor("red");

      System.out.println(houseService.getFullAddress(house));
   }
}
