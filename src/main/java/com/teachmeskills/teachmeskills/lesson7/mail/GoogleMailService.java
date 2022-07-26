package com.teachmeskills.teachmeskills.lesson7.mail;

public class GoogleMailService implements MailService
{
   @Override
   public boolean sendMessage(String message)
   {
      System.out.println("message:" + message + ", sent via Google");
      return true;
   }
}
