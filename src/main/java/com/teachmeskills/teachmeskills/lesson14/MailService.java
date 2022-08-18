package com.teachmeskills.teachmeskills.lesson14;

import java.util.function.Function;

public class MailService
{
   public void createAndSendMessage(Function<String, String> cipher,
            Function<String, String> escape, String body, String sender)
   {
      String appliedSender = escape.apply(sender);
      String encryptedSender = cipher.apply(appliedSender);

      String appliedBody = escape.apply(body);
      String encryptedBody = cipher.apply(appliedBody);

      System.out.println(encryptedSender + encryptedBody);
   }
}
