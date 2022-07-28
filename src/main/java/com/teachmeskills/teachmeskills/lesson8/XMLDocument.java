package com.teachmeskills.teachmeskills.lesson8;

public class XMLDocument extends Document
{
   private int rowsCount;

   public XMLDocument(int name, int rowsCount)
   {
      super(name);
      this.rowsCount = rowsCount;
   }

   @Override
   public String getDocumentInfo()
   {
      return getDocumentInfo() + rowsCount;
   }

   public int getRowsCount()
   {
      return rowsCount;
   }

   public void setRowsCount(int rowsCount)
   {
      this.rowsCount = rowsCount;
   }
}
