package com.example.staticproxy;

/**
 * 静态代理,持有被代理的对象，构造传入
 */
public class GreetingProxy implements Greeting {
    private Greeting greeting;

    public GreetingProxy(Greeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public void sayHello(String name) {
        before();
        greeting.sayHello(name);
        after();
    }

    private void after() {
        System.out.println("after...");
    }

    private void before() {
        System.out.println("before...");
    }
}
