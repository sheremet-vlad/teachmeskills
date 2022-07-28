package com.teachmeskills.teachmeskills.lesson8.realproject.service;

import com.teachmeskills.teachmeskills.lesson8.realproject.entity.Mobile;
import com.teachmeskills.teachmeskills.lesson8.realproject.entity.Product;

import java.util.List;

public class MobileCartService implements CartService
{
   @Override
   public double calculatePrice(Product[] products)
   {
      double sum = 0;

      for (Product product : products)
      {
         sum += product instanceof Mobile ?
                  product.getPrice() / 2 :
                  product.getPrice();
      }

      return sum;
   }
}
