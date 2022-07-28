package com.teachmeskills.teachmeskills.lesson8.realproject;

import com.teachmeskills.teachmeskills.lesson8.realproject.entity.Laptop;
import com.teachmeskills.teachmeskills.lesson8.realproject.entity.Mobile;
import com.teachmeskills.teachmeskills.lesson8.realproject.entity.Product;
import com.teachmeskills.teachmeskills.lesson8.realproject.service.CartService;
import com.teachmeskills.teachmeskills.lesson8.realproject.service.MobileCartService;

public class Main
{
   public static void main(String[] args)
   {
      CartService cartService = new MobileCartService();

      cartService.calculatePrice(new Product[] {new Laptop(), new Mobile()});
   }
}
