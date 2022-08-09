package com.teachmeskills.teachmeskills.lesson11;

import com.teachmeskills.teachmeskills.lesson11.animal.Dog;

import java.io.IOException;

public class DogService
{
   public void voice() throws CustomException, NullPointerException
   {
      throw new CustomException();
   }

   public void run()
   {
      throw new IllegalArgumentException("не тот аргумент");
   }

   public void jump(Dog dog)
   {
      if (dog == null)
      {
         throw new IllegalArgumentException();
      }

      dog.run();
   }

   public String execute() throws CustomException
   {
      try
      {
         voice();
         /*run();
         jump();*/

         System.out.println("успешно закончил");
      }
      catch (IllegalArgumentException | NullPointerException e)
      {
         System.out.println("побежать не получилось");
         return "не вышло доделать все до конца";
      }
      catch (Exception e)
      {
         e.printStackTrace();
         System.out.println("не получилось гавкнуть");
      }
      /*catch (IOException e)
      {
         System.out.println("прыгнуть не получилось");
      }*/

      return "закончил";
   }
}
