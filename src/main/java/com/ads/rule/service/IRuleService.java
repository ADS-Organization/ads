package com.ads.rule.service;

import com.ads.po.Task;

/**
 * @Author zhengqiang.shi
 * @Date 2020/2/21 下午8:42
 */
public interface IRuleService {

    Task process(String params);
}
