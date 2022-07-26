package com.teachmeskills.teachmeskills.lesson7.mail;

public class YandexMailService implements MailService
{
   @Override
   public boolean sendMessage(final String message)
   {
      System.out.println("message:" + message + ", sent via Yandex");
      return true;
   }
}
