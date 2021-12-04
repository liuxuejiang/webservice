package com.xikang;

import javax.jws.WebService;

@WebService
public class hello  implements  IHello {

    @Override
    public String showWord(String name) {
        return "hello word, hello "+ name;
    }
}
