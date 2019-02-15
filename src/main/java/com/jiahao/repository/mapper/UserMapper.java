package com.jiahao.repository.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author fangjiahao
 * @data 2019/2/15 10:55
 */
@Repository
public interface UserMapper {
    String login(@Param(value = "name") String name, @Param(value = "password") String password);
}
