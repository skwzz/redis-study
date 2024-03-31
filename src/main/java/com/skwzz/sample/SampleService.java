package com.skwzz.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SampleService {

    private final RedisTemplate redisTemplate;

    public void setValue(String key, String value){
        ValueOperations<String, String> op = redisTemplate.opsForValue();
        op.set(key, value);
    }

    public String getValue(String key){
        ValueOperations<String, String> op = redisTemplate.opsForValue();
        return op.get(key);
    }
}
