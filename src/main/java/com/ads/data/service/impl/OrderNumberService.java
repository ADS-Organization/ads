package com.ads.data.service.impl;

import com.ads.data.service.IDataService;
import com.ads.po.Task;
import org.springframework.stereotype.Service;

/**
 * @Author zhengqiang.shi
 * @Date 2020/2/20 下午10:38
 */
@Service("OrderNumberService")
public class OrderNumberService implements IDataService {


    @Override
    public Task process(String params) {
        System.out.println("OrderNumberService run...");
        return null;
    }
}
