package com.teachmeskills.teachmeskills.lesson7.mail;

import com.teachmeskills.teachmeskills.lesson7.animal.Animal;
import com.teachmeskills.teachmeskills.lesson7.animal.Bird;
import com.teachmeskills.teachmeskills.lesson7.animal.Monkey;
import com.teachmeskills.teachmeskills.lesson7.animal.Movable;
import com.teachmeskills.teachmeskills.lesson7.animal.Tiger;

public class Main
{
   public static void main(String[] args)
   {
      MailService[] mailServices = {new GoogleMailService(), new OperaMailService(),
               new YandexMailService()};

      for(MailService mailService : mailServices)
      {
         mailService.sendMessage("123");
      }

      Animal[] animals = { new Bird(), new Monkey() };

      Animal monkey = new Monkey();

      for (Animal animal : animals)
      {
         animal.sayMessage();
      }

      test(new GoogleMailService());
   }

   public static void test(MailService mailService)
   {
      mailService.sendMessage("1");
   }
}
