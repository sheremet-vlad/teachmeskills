package com.teachmeskills.teachmeskills.car;

public class Engine
{
   private int volume;
   public int size;
   protected String material;
   double temperature;


   protected void start()
   {

      temperature = temperature + 20;
   }

   public void stop()
   {
      start();
      temperature = temperature - 20;
   }
}

