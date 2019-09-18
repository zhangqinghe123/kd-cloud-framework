package com.kedong.elecmarket.core.bean.entity.fee;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author 张庆贺
 * @since 2019/7/3 21:29
 */
public class GridFee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UUID")
    @Column(name = "id")
    private Integer id;
    private Integer monthQty;
    private BigDecimal price;
    private BigDecimal monthFee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonthQty() {
        return monthQty;
    }

    public void setMonthQty(Integer monthQty) {
        this.monthQty = monthQty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMonthFee() {
        return monthFee;
    }

    public void setMonthFee(BigDecimal monthFee) {
        this.monthFee = monthFee;
    }
}
