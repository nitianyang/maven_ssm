package com.agree.bank.zjjg.dao;


import com.agree.bank.zjjg.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.Cacheable;

@Mapper
public interface UserDao {
    @Cacheable
    public Users selectById(Integer id);
}
