package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Mr.Jin
 * @Date 2023/5/16/0016 11:24
 * @Version 1.0
 */
@Mapper
public interface StorageDao {
    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
