package com.teachmeskills.teachmeskills.lesson8.realproject.service;

import com.teachmeskills.teachmeskills.lesson8.realproject.entity.Product;

public interface CartService
{
   double calculatePrice(Product[] products);
}
