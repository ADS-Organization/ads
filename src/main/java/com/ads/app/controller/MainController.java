package com.ads.app.controller;

import com.ads.data.service.OrderNumberService;
import com.ads.model.Sigma;
import com.ads.rule.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhengqiang.shi
 * @Date 2020/2/20 下午10:39
 */
@RestController
public class MainController {

    @Autowired
    private OrderNumberService orderNumberService;

    @Autowired
    private RuleService ruleService;

    @Autowired
    private Sigma sigma;

    @RequestMapping("/run")
    public void main(@RequestBody String params){
        orderNumberService.process(params);
        ruleService.process(params);
        sigma.process(params);

    }

    @RequestMapping("/result")
    public String result(@RequestBody String params){
        return null;
    }
}
