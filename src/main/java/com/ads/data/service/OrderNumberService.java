package com.ads.data.service;

import com.ads.data.dao.OrderNumberDao;
import com.ads.rule.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhengqiang.shi
 * @Date 2020/2/20 下午10:38
 */
@Service
public class OrderNumberService {

    @Autowired
    private OrderNumberDao orderNumberDao;

    @Autowired
    private RuleService ruleService;

    public void process(String params){

        // 1.获取数据源

        // 2.开始清洗

        // 3.数据存储
        orderNumberDao.save(null);

        // 4.调用规则层
        ruleService.process(params);
    }
}
