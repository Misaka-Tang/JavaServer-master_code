package com.yaoqi.service.impl;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class MessageServiceImpl implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
       setFieldValByName("datetime", new Date(),  metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        return;
    }
}
