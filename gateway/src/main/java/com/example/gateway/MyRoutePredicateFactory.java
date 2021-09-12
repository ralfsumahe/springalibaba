package com.example.gateway;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
@Component
public class MyRoutePredicateFactory extends AbstractRoutePredicateFactory<MyRoutePredicateFactory.Config> {
    public MyRoutePredicateFactory() {
        super(Config.class);
    }


    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        log.info("执行 MyRoutePredicateFactory");
        return new GatewayPredicate() {
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                if (config.getName().equals("linkun")) {
                    return true;
                } else {
                    return false;
                }
            }
        };
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList("name");
    }

    @Data
    public static class Config {
        private String name;
        private String value;

    }
}
