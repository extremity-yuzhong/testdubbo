package com.test.dubbo.client;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = {"classpath:dubbo-customer.xml"})
@Configuration
public class DubboConfig {
}
