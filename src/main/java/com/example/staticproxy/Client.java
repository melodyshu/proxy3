package com.example.staticproxy;

public class Client {
    public static void main(String[] args) {
        Greeting greeting=new GreetingImpl();
        GreetingProxy proxy=new GreetingProxy(greeting);
        proxy.sayHello("张三");
    }
}
