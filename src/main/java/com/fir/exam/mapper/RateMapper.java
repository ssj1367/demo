package com.fir.exam.mapper;

import com.fir.exam.bean.Rate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RateMapper {
    Rate selectRate(Rate rate);
}
