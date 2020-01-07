package com.example.dynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Client {
    public static void main(String[] args) {
        JDKDynamicProxy proxy=new JDKDynamicProxy(new GreetingImpl());
        Greeting greeting = proxy.getProxy();
        greeting.sayHello("张三");

        //将代理类输出
        byte[] bytes= ProxyGenerator.generateProxyClass("$Proxy0",greeting.getClass().getInterfaces());
        String filename="$Proxy.class";

        try(OutputStream outputStream=new FileOutputStream(filename)) {
            outputStream.write(bytes);
            outputStream.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
