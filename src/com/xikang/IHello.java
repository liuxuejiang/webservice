package com.xikang;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHello {
    @WebMethod
    public String showWord(String name);
}
