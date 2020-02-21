package com.ads.app.controller;

import com.ads.data.service.IDataService;
import com.ads.model.service.IAlgorithmService;
import com.ads.model.service.impl.Sigma;
import com.ads.po.Task;
import com.ads.rule.service.IRuleService;
import com.ads.util.SpringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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
    private Sigma sigma;

    /**
     * param:
     * {
     *     "callSort": "1,2,1,2,3",
     *     "importTask": {
     *     	"dt":"",
     *     	"tableName":""
     *     },
     *     "dataParams": {
     *         "serviceName": "OrderNumberService"
     *     },
     *     "ruleParams": {
     *         "serviceName": "BRuleServiceImpl"
     *     },
     *     "algorithmParams": {
     *         "serviceName": "Sigma2"
     *     }
     * }
     */
    @RequestMapping("/run")
    public void main(@RequestBody String params){

        // 1.参数解析
        JSONObject jsonObject = JSON.parseObject(params);
        JSONObject dataParams = jsonObject.getJSONObject("dataParams");
        JSONObject ruleParams = jsonObject.getJSONObject("ruleParams");
        JSONObject algorithmParams = jsonObject.getJSONObject("algorithmParams");

        String callSort = jsonObject.getString("callSort");

        String dataServiceName = dataParams.getString("serviceName");
        IDataService dataService = SpringUtils.getBeanByName(dataServiceName, IDataService.class);

        String ruleServiceName = ruleParams.getString("serviceName");
        IRuleService ruleService = SpringUtils.getBeanByName(ruleServiceName, IRuleService.class);

        String algorithmServiceName = algorithmParams.getString("serviceName");
        IAlgorithmService algorithmService = SpringUtils.getBeanByName(algorithmServiceName, IAlgorithmService.class);

        // 运行任务 1，2，1，2，3
        String[] sort = callSort.split(",");
        Task task = null;
        for (String s : sort) {
            if(task != null){
                jsonObject.put("task",task);
            }
            switch (s) {
                case "1":
                    task = dataService.process(jsonObject.toJSONString());
                    break;
                case "2":
                    task = ruleService.process(jsonObject.toJSONString());
                    break;
                case "3":
                    task = algorithmService.process(jsonObject.toJSONString());
                    break;
                default:
                    break;
            }
        }

    }

    @RequestMapping("/result")
    public String result(@RequestBody String params){
        return null;
    }
}
