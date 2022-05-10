package com.marth.myblog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspringApplicationTests {

    @Autowired
    private RedisCli redisCli;

    @Test
    public void contextLoads() {
        StringRedisTemplate redis = redisCli.getTemplate();
        redis.opsForValue().set("name", "Jack");
        String firstName = redis.opsForValue().get("name");
        System.out.println(firstName);
        redis.opsForValue().set("name", "Rose");
        String secondName = redis.opsForValue().get("name");
        System.out.println(secondName);
    }
}
