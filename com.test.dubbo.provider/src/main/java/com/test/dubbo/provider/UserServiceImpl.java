package com.test.dubbo.provider;

import com.test.dubbo.client.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public String hello(String name) {
        return "helle "+name;
    }
}
