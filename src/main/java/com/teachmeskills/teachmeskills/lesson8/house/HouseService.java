package com.teachmeskills.teachmeskills.lesson8.house;

public class HouseService
{
   private String country = "Belarus!";

   public String getFullAddress(final House house)
   {
      String houseAddress = getHouseAddress(house, 10);

      return  country + houseAddress;
   }

   private String getHouseAddress(final House house, final int count)
   {
      return "city: " + house.getCity() + ", " + house.getHouseNumber();
   }
}
