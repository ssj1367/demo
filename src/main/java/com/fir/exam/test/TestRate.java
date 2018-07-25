package com.fir.exam.test;

import com.fir.exam.bean.Convert;
import com.fir.exam.bean.Rate;
import com.fir.exam.mapper.ConvertMapper;
import com.fir.exam.mapper.RateMapper;
import com.fir.exam.util.Constant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRate {
    @Autowired
    RateMapper rateMapper;

    @Autowired
    ConvertMapper convertMapper;

    @Test
    public void test1(){
        Rate r = new Rate();
        r.setFrom(Constant.DOLLAR);
        r.setTo(Constant.RMB);
        Rate rate = rateMapper.selectRate(r);

        System.out.println(rate);
    }

    @Test
    public void test2(){
        Convert c = new Convert();
        c.setAmount(new BigDecimal(12));
        c.setRate(new BigDecimal(6.0));
        c.setFrom(Constant.DOLLAR);
        c.setTo(Constant.RMB);
        c.setRateId(1);

        convertMapper.insertConvert(c);
    }
}
