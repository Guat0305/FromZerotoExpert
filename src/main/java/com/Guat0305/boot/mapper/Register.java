package com.Guat0305.boot.mapper;

import com.Guat0305.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Yx_Gg
 */

@Mapper
public interface Register {

    public List<User> findAlluser();
    public User findUserbyName(String username);
    public int insertUser(User user);
}
