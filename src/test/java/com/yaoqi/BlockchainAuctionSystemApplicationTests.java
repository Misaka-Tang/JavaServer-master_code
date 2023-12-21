package com.yaoqi;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yaoqi.entity.Message;
import com.yaoqi.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class BlockchainAuctionSystemApplicationTests {
    @Autowired
    MessageService service;

    @Test
    void contextLoads() {
        Message message=new Message();
        message.setContent("fafa");
        message.setAccount("faaa");
        message.setProductid("1111");
        service.insert(message);
    }

    @Test
    void test2(){
        QueryWrapper<Message> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("productid", "1111");
        List<Message> messages = service.selectList(queryWrapper);
        for (Message message: messages){
            System.out.println(message.toString());
        }
         }
}
