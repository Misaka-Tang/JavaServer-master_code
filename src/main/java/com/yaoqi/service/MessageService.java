package com.yaoqi.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yaoqi.entity.Message;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface MessageService extends BaseMapper<Message> {
    List<Message> getMessages();
}
