package com.fight.dao;


import com.fight.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {

    // 插入用户
    int insert(AdminUser user);
    int insertSecective(AdminUser user);
    // 根据id查询用户
    AdminUser selectByPrimaryKey(Integer adminUserId);
    // 更新用户
    int updateByPrimaryKeySelective(AdminUser user);
    int updateByPrimaryKey(AdminUser user);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    AdminUser login(@Param("username") String username, @Param("password") String password);


}
