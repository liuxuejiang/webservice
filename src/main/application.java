package main;


import javax.xml.ws.Endpoint;
import com.xikang.hello;

public class application {

    public static void main(String[] args){
        Endpoint.publish("http://localhost:8088/ws_server/worda",new hello());
        System.out.println("发布webservice服务");
    }
}
