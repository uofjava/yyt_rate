package com.ymy.yyt_rate;

import com.ymy.yyt_rate.engite.Rate;
import com.ymy.yyt_rate.engite.Value;
import com.ymy.yyt_rate.server.IRateService;
import com.ymy.yyt_rate.server.IValueService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YytRateApplicationTests {

    @Autowired
    private IValueService iValueService;
    @Autowired
    private IRateService iRateService;
    @Test
    void contextLoads() {
        Rate rate = new Rate();
        rate.setRateFatherId(1);
        rate.setName("test");
        rate.setValue(0);
        rate.setState('0');
        iRateService.save(rate);
        System.out.printf(""+rate.getId());

        Value value = new Value();
        value.setValue(2000);
        value.setName("testt");
        value.setRateId(1);
        value.setState('0');
        iValueService.save(value);
        System.out.printf("test");
    }

}
