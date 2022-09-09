package com.teachmeskills.teachmeskills.lesson15;

@FunctionalInterface
public interface Executor<T>
{
   T execute(T t);
}
