package com.teachmeskills.teachmeskills.lesson9;

public class ArgumentSetter
{
   public static void main(String[] args)
   {
      ArgumentSetter argumentSetter = new ArgumentSetter();

      int a = 3;
      argumentSetter.testInt(a);
      System.out.println(a);

      final Car car = new Car();
      car.setName("audi");
      argumentSetter.testCar(car);
      System.out.println(car);
   }

   public void testInt(int a)
   {
      a = 10;
      System.out.println(a);
   }

   public void testCar(final Car car)
   {
      car.setName("bmw");
      System.out.println(car);
   }

}

class Car
{
   private String name;

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   @Override
   public String toString()
   {
      return "Car{" +
               "name='" + name + '\'' +
               '}';
   }
}
