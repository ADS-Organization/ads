package com.ads.rule.service;

import com.ads.model.Sigma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhengqiang.shi
 * @Date 2020/2/20 下午10:53
 */
@Service
public class RuleService {

    @Autowired
    private Sigma sigma;

    public void process(String params){

        // 1. 根据数据层的参数，读取数据源

        // 2. 过滤规则

        // 3. 调用模型层
        sigma.process(params);
    }
}
