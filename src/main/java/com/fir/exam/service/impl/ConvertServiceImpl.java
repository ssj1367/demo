package com.fir.exam.service.impl;

import com.fir.exam.bean.Convert;
import com.fir.exam.mapper.ConvertMapper;
import com.fir.exam.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertServiceImpl implements ConvertService {
    @Autowired
    ConvertMapper convertMapper;

    @Override
    public void saveConvert(Convert convert) {
        convertMapper.insertConvert(convert);
    }
}
