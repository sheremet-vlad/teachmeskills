package com.teachmeskills.teachmeskills.lesson15;

import java.util.List;

public class Product
{
   private String name;
   private List<String> listOfDescriptions;

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public List<String> getListOfDescriptions()
   {
      return listOfDescriptions;
   }

   public void setListOfDescriptions(List<String> listOfDescriptions)
   {
      this.listOfDescriptions = listOfDescriptions;
   }
}

