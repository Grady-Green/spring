package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    Integer update(User user);
    User get(Long id);
    List<User> getByCondition(User user);
    Integer countByCondition(User user);
    List<User> getPageByCodition(User user);
    Integer save(User user);
    Integer saveAndGetId(User user);
    Integer saveList(List<User> list);
    Integer delete(Long id);
    Integer delEntity(User user);
}