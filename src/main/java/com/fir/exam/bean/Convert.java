package com.fir.exam.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name="convert")
public class Convert implements Serializable {
    @Id
    @Column
    private Integer id;
    @Column
    private BigDecimal amount;
    @Column
    private BigDecimal rate;
    @Column
    private String from;
    @Column
    private String to;
    @Column
    private Integer rateId;

    public Convert() {
    }

    public Convert(Integer id, BigDecimal amount, BigDecimal rate, String from, String to, Integer rateId) {
        this.id = id;
        this.amount = amount;
        this.rate = rate;
        this.from = from;
        this.to = to;
        this.rateId = rateId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
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

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
        this.rateId = rateId;
    }

    @Override
    public String toString() {
        return "Convert{" +
                "amount=" + amount +
                ", rate=" + rate +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
