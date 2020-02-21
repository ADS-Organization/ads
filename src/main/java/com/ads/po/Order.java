package com.ads.po;

/**
 * @Author zhengqiang.shi
 * @Date 2020/2/21 下午9:27
 */
public class Order {

    private Long id;

    private Long orderNumber;

    private String dt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }
}
