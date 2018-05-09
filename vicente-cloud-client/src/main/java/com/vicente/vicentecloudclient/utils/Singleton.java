package com.vicente.vicentecloudclient.utils;

public class Singleton
{
    //private static Singleton singleton = new Singleton();   //第一种：放在这儿运行结果是counter1=1,counter2=0
    public static int counter1;
    public static int counter2=0;
    private static Singleton singleton = new Singleton();   //第二种：放在这儿运行结果是counter1=1,counter2=1

    private Singleton()
    {
        counter1++;
        counter2++;
    }
    public static Singleton getInstance()
    {
        return singleton;
    }
}
