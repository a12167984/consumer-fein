package com.springcloud.consumerfein;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(value = "springcloud-provider")     //定义提供者的application name,  无熔断器
@FeignClient(value = "springcloud-provider",fallback = TestService_Hystric.class)     //增加fein 熔断器


//************ 注意这里是 interface，不是class，  与 ribbon方式 不同
public interface TestService {

    @RequestMapping("/provider")  //不是调用 /test，实际是调用 提供者的 /provider
    public String test();

}
