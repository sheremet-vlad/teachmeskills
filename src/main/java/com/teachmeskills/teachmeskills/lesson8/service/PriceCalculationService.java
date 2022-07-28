package com.teachmeskills.teachmeskills.lesson8.service;

public class PriceCalculationService
{
   private static final int COST = 10;

   public int calculatePrice(int count)
   {
      return count * COST;
   }
}
