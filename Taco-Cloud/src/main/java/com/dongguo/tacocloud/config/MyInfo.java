package com.dongguo.tacocloud.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MyInfo implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> info = new HashMap<>();
        info.put("name", "东郭");
        info.put("email", "dongguo@123.com");
        builder.withDetail("author", info);
    }
}
