package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Mr.Jin
 * @Date 2023/5/16/0016 11:26
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {
    private Long id;
    private Long productId;//产品id
    private Integer total;//总库存
    private Integer used;//已用库存
    private Integer residue;//剩余库存
}
