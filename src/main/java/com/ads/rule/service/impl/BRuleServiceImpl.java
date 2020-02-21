package com.ads.rule.service.impl;

import com.ads.po.Task;
import com.ads.rule.service.IRuleService;
import org.springframework.stereotype.Service;

/**
 * @Author zhengqiang.shi
 * @Date 2020/2/21 下午8:45
 */
@Service("BRuleServiceImpl")
public class BRuleServiceImpl implements IRuleService {
    @Override
    public Task process(String params) {
        System.out.println("BRuleServiceImpl run...");
        return null;
    }
}
