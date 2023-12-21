package com.yaoqi.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yaoqi.entity.Message;
import com.yaoqi.service.MessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/message"))
public class MessageController {
    @Autowired
    MessageService service;

    @PostMapping("/submitMessage")
    public void submitMessage(@RequestBody Message message){
        System.out.println("has been here");
        service.insert(message);
        System.out.println("finished");
    }

    @GetMapping("/getMessageList/{id}")
    @ResponseBody
    public List<Message> getMessageList(@PathVariable String id){
        QueryWrapper<Message> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("productid", id);
        List<Message> messageList = service.selectList(queryWrapper);
        return messageList;
    }
}
