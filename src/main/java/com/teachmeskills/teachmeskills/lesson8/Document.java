package com.teachmeskills.teachmeskills.lesson8;

public abstract class Document implements Printable
{
   private int name;

   public Document(int name)
   {
      this.name = name;
   }

   public int getName()
   {
      return name;
   }

   public void setName(int name)
   {
      this.name = name;
   }
}
