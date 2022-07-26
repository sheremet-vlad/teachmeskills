package com.teachmeskills.teachmeskills.lesson7;

public class ComputerService
{
   public void addSizeToHdd(final Computer temp) {
      int size = temp.getHdd().getSize();
      temp.getHdd().setSize(size + 30);
   }
}
