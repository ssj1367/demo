package com.fir.exam.service.impl;

import com.fir.exam.bean.Rate;
import com.fir.exam.mapper.RateMapper;
import com.fir.exam.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateServiceImpl implements RateService{
    @Autowired
    RateMapper rateMapper;

    @Override
    public Rate getRate(Rate rate) {

        Rate newRate = rateMapper.selectRate(rate);
        return newRate;
    }
}
