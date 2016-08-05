package com.bitwise.assignment.cascading;

public class InnerJoin1{
    private String s;
    private int a;
    public InnerJoin1(){
        s="Aniruddha";
        a=23;
    }
    public InnerJoin1(String name,int age){
        s=name;
        a=age;
    }
    public String getName(){return s;}
    public int getAge(){return a;}
}