package com.ads.po;

/**
 * @Author zhengqiang.shi
 * @Date 2020/2/21 下午9:28
 */
public class Task {

    private Long id;

    private String tableName;

    private String dt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }
}
