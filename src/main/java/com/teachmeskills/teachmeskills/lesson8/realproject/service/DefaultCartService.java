package com.teachmeskills.teachmeskills.lesson8.realproject.service;

import com.teachmeskills.teachmeskills.lesson8.realproject.entity.Product;


public class DefaultCartService implements CartService
{
   @Override
   public double calculatePrice(Product[] products)
   {
      double sum = 0;

      for (Product product : products)
      {
         sum += product.getPrice();
      }

      return sum;
   }
}
