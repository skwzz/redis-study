package com.skwzz.sample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleServiceTest {

    @Autowired
    private SampleService sampleService;

    @Test
    @DisplayName("레디스 값 정상 저장 확인")
    public void redisSetGetTest(){

        // given
        String key = "123123";
        String value = "testValue";

        // when
        sampleService.setValue(key, value);

        // then
        String getValue = sampleService.getValue(key);
        Assertions.assertThat(getValue).isEqualTo(value);
    }
}