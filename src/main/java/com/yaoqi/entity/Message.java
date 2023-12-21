package com.yaoqi.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("Message")
@Data
public class Message {
    private String account;
    private String content;
    private String productid;
    @TableField(value = "datetime", fill = FieldFill.INSERT)
    private Date datetime;
}
