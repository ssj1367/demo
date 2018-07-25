package com.fir.exam.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

public class Rate implements Serializable {
    @Id
    @Column
    private Integer id;
    @Column
    private String from;
    @Column
    private String to;
    @Column
    private BigDecimal rate;
    @Column
    private String beginTime;
    @Column
    private String endTime;
    @Column
    private Integer status;

    public Rate() {
    }

    public Rate(Integer id, String from, String to, BigDecimal rate, String beginTime, String endTime, Integer status) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.rate = rate;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", rate=" + rate +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", status=" + status +
                '}';
    }
}
