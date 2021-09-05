package com.example.userservice.config;

import feign.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }


    //添加feign拦截器
    @Bean
    public FeignAuthRequestInteceptor feignAuthRequestInteceptor(){
        return new FeignAuthRequestInteceptor();
    }

    static class FeignAuthRequestInteceptor implements RequestInterceptor{

        @Override
        public void apply(RequestTemplate requestTemplate) {
            String uuid = UUID.randomUUID().toString();
            requestTemplate.header("token",uuid);
        }
    }
}
