package com.springcloud.consumerfein;

import org.springframework.stereotype.Component;


//*****  实现熔断器，服务不可用时直接显示如下字符串


@Component
public class TestService_Hystric implements TestService {

    @Override
    public String test(){
        return  "Fein test() Erro -- 熔断器调用";
    }

}
