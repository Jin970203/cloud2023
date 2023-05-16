package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Mr.Jin
 * @Date 2023/5/16/0016 13:08
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long id;
    private Long userId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
