package main.java;


import com.xikang.Hello;
import com.xikang.HelloService;

public class application_client {
    public static void main(String[] args){
        HelloService  factory  = new HelloService();
        Hello hello =  factory.getHelloPort();
        String retStr = hello.showWord("刘其岭");

        System.out.println("ws 调用结果： " + retStr);
        System.out.println("ws客户端调用!");
    }

}
