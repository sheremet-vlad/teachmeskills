package com.teachmeskills.teachmeskills.car;

public class Car
{
   public void setEngineFields(Engine engine)
   {
      engine.size = 10;
      engine.material = "iron";
      engine.temperature = 100.0;
   }

   public void startEngine(Engine engine)
   {
      engine.start();
   }

   public static void main(String[] args)
   {
      Car car = new Car();

      Engine engine = new Engine();

      car.setEngineFields(engine);

      car.startEngine(engine);
   }


}
