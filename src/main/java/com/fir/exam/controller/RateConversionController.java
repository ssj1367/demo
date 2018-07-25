package com.fir.exam.controller;

import com.fir.exam.bean.Convert;
import com.fir.exam.bean.Rate;
import com.fir.exam.service.ConvertService;
import com.fir.exam.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@Controller
public class RateConversionController {
    @Autowired
    RateService rateService;

    @Autowired
    ConvertService convertService;

        /*  1	USD	CNY	6.00
            2	GBP	CNY	8.91
            3	EUR	CNY	7.94
            4	JPY	CNY	0.06
            5	AUD	CNY	0.86
            6	CNY	USD	0.15
            7	CNY	GBP	0.11
            8	CNY	EUR	0.13
            9	CNY	JPY	16.35
            10	CNY	AUD	0.19 */
    @RequestMapping(value = "/convert/{from}/{to}", method = RequestMethod.GET)
    @ResponseBody
    public Convert rateConversion(@PathVariable("from") String from, @PathVariable("to") String to, @RequestParam(value="amount",required=false) String amount) {

        Convert convert = new Convert();

        if (from != null && to != null && amount!=null) {
            // 获取对应汇率
            Rate r = new Rate();
            r.setFrom(from);
            r.setTo(to);
            Rate rate = rateService.getRate(r);

            // 汇率失效
            if (rate.getStatus() == 1) {
                return null;
            }
            // 设置值到对象中
            convert.setAmount(new BigDecimal(amount).multiply(rate.getRate()));
            convert.setRate(rate.getRate());
            convert.setFrom(from);
            convert.setTo(to);
            convert.setRateId(rate.getId());

            // 保存到数据库
            convertService.saveConvert(convert);
        }
        return convert;
    }
}
