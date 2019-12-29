package com.test.dubbo.provider;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = {"classpath:dubbo-provider.xml"})
@Configuration
public class DubboConfig {
}
