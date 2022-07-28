package com.teachmeskills.teachmeskills.lesson8.service;

public class PriceWithDiscountCalculationService extends PriceCalculationService
{

   public static final int DISCOUNT = 3;

   @Override
   public int calculatePrice(int count)
   {
      int totalPrice = super.calculatePrice(count);

      return totalPrice - count * DISCOUNT;
   }
}
