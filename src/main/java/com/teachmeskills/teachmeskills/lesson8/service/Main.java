package com.teachmeskills.teachmeskills.lesson8.service;

public class Main
{
   public static void main(String[] args)
   {
      PriceCalculationService priceCalculationService = new PriceWithDiscountCalculationService();

      int totalPrice = priceCalculationService.calculatePrice(30);

      System.out.println(totalPrice);
   }
}
