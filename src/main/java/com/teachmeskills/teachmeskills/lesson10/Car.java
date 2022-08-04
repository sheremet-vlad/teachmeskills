package com.teachmeskills.teachmeskills.lesson10;

import java.util.Arrays;

public class Car implements Cloneable
{
   private String name;
   private int year;
   private Engine engine;
   private Door[] doors;

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public int getYear()
   {
      return year;
   }

   public void setYear(int year)
   {
      this.year = year;
   }

   public Engine getEngine()
   {
      return engine;
   }

   public void setEngine(Engine engine)
   {
      this.engine = engine;
   }

   public Door[] getDoors()
   {
      return doors;
   }

   public void setDoors(Door[] doors)
   {
      this.doors = doors;
   }

   @Override
   public Car clone() throws CloneNotSupportedException
   {

      Car car = new Car();
      //неглубокое
      car.setEngine(engine);

      //глубокое
      Engine engine1 = new Engine();
      engine1.setPower(engine.getPower());
      engine1.setSize(engine.getSize());

      car.setEngine(engine1);

      return (Car) super.clone();
   }

   @Override
   public String toString()
   {
      return "Car{" +
               "name='" + name + '\'' +
               ", year=" + year +
               ", engine=" + engine +
               ", doors=" + Arrays.toString(doors) +
               '}';
   }
}
