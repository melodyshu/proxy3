package com.example.dynamicproxy;


/**
 *
 */
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("hello "+name);
    }

}
