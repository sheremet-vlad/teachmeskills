package com.teachmeskills.teachmeskills.lesson14;

@FunctionalInterface
public interface Executor<T, F, S, D>
{
   D execute(T t, F f, S s);
}
