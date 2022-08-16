package com.teachmeskills.teachmeskills.lesson13;

public class TestGeneric<T, E, F>
{
   public T getFirstParam(T t)
   {
      return t;
   }

   public E getSecondParam(E e)
   {
      return e;
   }

   public F getThirdParam(F f)
   {
      return f;
   }

   public T getFirstTypeWithSecondParam(E e)
   {
      return null;
   }

   public <C> C getNewGenericType(C c)
   {
      return c;
   }
}
