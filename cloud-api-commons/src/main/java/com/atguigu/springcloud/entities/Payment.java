package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Mr.Jin
 * @Date 2023/4/20/0020 16:36
 * @Version 1.0
 */
//这三个注解是lombok的，除了导入依赖，idea还需要安装插件（具体操作问度娘）
@Data   //set/get方法
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
public class Payment implements Serializable {
    private long id;
    private String serial;
}

