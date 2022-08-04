package com.teachmeskills.teachmeskills.lesson10.enumexample;

public enum Month
{
   MAY("may"),
   JUNE("june"),
   JULY("july"),

   TEN_EUR0("10");

   private String value;

   Month(String value)
   {
      this.value = value;
   }

   public String getValue()
   {
      return value;
   }

   public static Month getEnum(String value)
   {
      for (Month v : values())
      {
         if (v.getValue().equalsIgnoreCase(value))
         {
            return v;
         }
      }

      throw new IllegalArgumentException();
   }
}
