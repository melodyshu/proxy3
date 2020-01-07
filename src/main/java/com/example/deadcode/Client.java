package com.example.deadcode;

public class Client {
    public static void main(String[] args) {
        Greeting greeting=new GreetingImpl();
        greeting.sayHello("张三");
    }
}
