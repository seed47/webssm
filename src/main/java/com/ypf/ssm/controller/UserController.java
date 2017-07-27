package com.ypf.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @RequestMapping("hello")
    public @ResponseBody JSONObject hello(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello","nihao");
//        return jsonObject.toJSONString();
        return jsonObject;
    }
}
