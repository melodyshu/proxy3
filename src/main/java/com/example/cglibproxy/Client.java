package com.example.cglibproxy;

public class Client {
    public static void main(String[] args) {
        Greeting proxy = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
        proxy.sayHello("张三");
    }
}
