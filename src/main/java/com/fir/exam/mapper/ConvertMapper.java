package com.fir.exam.mapper;

import com.fir.exam.bean.Convert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConvertMapper {
    void insertConvert(Convert convert);
}
